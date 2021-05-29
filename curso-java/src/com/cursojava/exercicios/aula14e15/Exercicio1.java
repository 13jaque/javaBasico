package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("Primeiro numero é maior: " + num1);
        }else if (num2 > num1){
            System.out.println("Segundo numero é maior: " + num2);
        }else{
            System.out.println("São iguais");
        }

    }
}
