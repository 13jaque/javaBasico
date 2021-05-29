package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Primeiro numero é maior: " +num1);
        }else if (num2 > num1 && num2 > num3 ){
            System.out.println("Segundo numero é maior: " +num2);
        }else if (num3 > num1 && num3 > num2 ){
            System.out.println("Terceiro numero é maior: " +num3);
        } else {
            System.out.println("São iguais");
        }
    }
}
