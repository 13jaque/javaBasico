package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Entre com a base: ");
        num1 = scan.nextInt();

        System.out.println("Entre com a potencia: ");
        num2 = scan.nextInt();

        //2^3 = 2 * 2 * 2
        int resultado = num1;
        for (int i = 1; i < num2; i++) {
            resultado += num1;
        }

        System.out.println("Resultado: " + resultado);
    }
}
