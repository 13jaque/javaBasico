package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Informe qual tabuada entre 1 e 10: ");
        num = scan.nextInt();

        System.out.println("A tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
