package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Primeira nota:" +nota1);
        System.out.println("Segunda nota:" +nota2);
        double media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);

        String conceito = null;

        if (media >= 9.0 && media <= 10.0){
            conceito = "A";
        }else if (media >= 7.5 && media <= 9.0){
            conceito = "B";
        }else if (media >= 6 && media <= 7.5){
            conceito = "C";
        }else if (media >= 4.0 && media <= 6.0){
            conceito = "D";
        }else if (media >= 0 && media < 4){
            conceito = "E";
        }
        if (conceito.equalsIgnoreCase("A") || conceito.equalsIgnoreCase ("B") || conceito.equalsIgnoreCase ("C")){
            System.out.println(conceito + " - Aprovado!");
        }else if (conceito.equalsIgnoreCase("D") || conceito.equalsIgnoreCase("E")){
            System.out.println(conceito + " - Reprovado!");
        }
    }
}
