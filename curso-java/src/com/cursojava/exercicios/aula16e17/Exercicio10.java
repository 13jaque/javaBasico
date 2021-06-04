package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Os numeros são: ");

        for (int i = num1; i <= num2; i++){
            System.out.print(i + " ");
        }
    }
}
