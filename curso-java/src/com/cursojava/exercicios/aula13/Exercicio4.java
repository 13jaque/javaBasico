package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe  1 nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe  2 nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Informe 3 nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Informe 4 nota");
        double nota4 = scan.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;

        System.out.println("A media é: " + soma / 4);


    }
}
