/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadordeimc;

        import java.util.Scanner;

public class ClassificadorDeIMC {

    public static void main(String[] args) {
        
        System.setProperty("file.encoding", "UTF-8");

        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu peso(kg): ");
        double peso = in.nextDouble();

        System.out.print("Digite sua altura(m): ");
        double altura = in.nextDouble();

        /*Calculo do imc*/
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC e: %.2f%n", imc);

        /*Classificação do IMC*/
        if (imc < 18.5) {
            System.out.println("Classificacao: Abaixo do peso");
        } 
        
        else if (imc < 25) {
            System.out.println("Classificacao: Peso normal");
        } 
        
        else if (imc < 30) {
            System.out.println("Classificacao: Sobrepeso");
        } 
        
        else if (imc < 40) {
            System.out.println("Classificacao: Obesidade");
        } 
        
        else {
            System.out.println("Classificacao: Obesidade grave");
        }

        /*Operador ternário*/
        String msg = imc < 25 ? "IMC dentro ou abaixo da faixa ideal." : "IMC acima da faixa ideal.";

        System.out.println(msg);

        /*Menu de faixa etária*/
        System.out.println("\n=================== FAIXA ETARIA ================");
        System.out.println("1 - Criança/Adolescente");
        System.out.println("2 - Adulto");
        System.out.println("3 - Idoso");
        System.out.print("Escolha uma opcao: ");

        int faixa_Etaria = in.nextInt();

        switch (faixa_Etaria) {
            case 1:
                System.out.println("Recomendacao: procure orientacao de um pediatra ou profissional especializado.");
                break;

            case 2:
                System.out.println("Recomendacao: mantenha uma alimentacao equilibrada e pratique atividades fisicas.");
                break;

            case 3:
                System.out.println("Recomendacao: procure orientacao profissional e mantenha atividades adequadas a sua idade.");
                break;

            default:
                System.out.println("Opcao de faixa etaria invalida.");
        }
        
        System.out.println("============================================");

        in.close();
    }
}
