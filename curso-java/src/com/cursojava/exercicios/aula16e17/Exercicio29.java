package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                   // System.out.println("Não é primo");
                    primo = false;
                }
            }
            System.out.println("i");
        }
    }
}
