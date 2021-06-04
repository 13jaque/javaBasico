package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //MIN_VALUE = verifica o menor numero
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("Entre com um numero: ");
            int num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }

        System.out.println("O maior numero é: " + maior);
    }
}
