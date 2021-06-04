package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        int media;

        for (int i = 0; i < 5; i++){
            System.out.println("Entre com um numero: ");
            num = scan.nextInt();

            //soma = num + num;
            soma += num;
        }
        media = soma / 5;

        System.out.println("A soma é: " + soma);
        System.out.println("A media é " + media);
    }
}
