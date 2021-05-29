package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 lado do triangulo: ");
        int lado1 = scan.nextInt();

        System.out.println("2 lado do triangulo: ");
        int lado2 = scan.nextInt();

        System.out.println("3 lado do triangulo: ");
        int lado3 = scan.nextInt();

        int soma;

        if ((lado1 + lado2) > lado3
                && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");

            } else if (lado1 != lado2 || lado1 != lado3 || lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Não é um Triângulo");
            }

        }
    }
}
