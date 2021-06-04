package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();

        double soma = 0;

        for (int i = 1, j = 1; i <= n; i++, j++){
            System.out.print(i + "/" + j + " + ");

            soma += i/j;
        }

        System.out.println("\nSoma = " + soma);
    }
}
