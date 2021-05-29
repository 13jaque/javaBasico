package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = scan.nextInt();
        int soma = num1 + num2;

        //System.out.println("A soma é: " + (num1 + num2));
        System.out.println("A soma é: " + soma);




    }
}
