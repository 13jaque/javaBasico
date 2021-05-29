package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor de A: ");
        int a = scan.nextInt();

        if (a == 0){
            System.out.println("Equação não é do segundo grau!");
        }else {

            System.out.println("Valor de B: ");
            int b = scan.nextInt();

            System.out.println("Valor de C: ");
            int c = scan.nextInt();

            double delta = Math.pow(b,2) - 4 * a * c;

            if (delta < 0){
                System.out.println("Delta negativo");
            } else{
                System.out.println("Delta = " + delta);

                double x1 = ((-b) + Math.sqrt(delta) / 2 * a);
                double x2 = ((-b) - Math.sqrt(delta) / 2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }


    }
}
