package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Sua peso ideal é: " + peso + "kg");


        //sem Scanner
       /*double altura = 1.66;
        double peso = (72.2 * altura) - 58;

        System.out.println(peso + "Kg");*/
    }
}
