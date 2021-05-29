package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("Positvo");
        }else{
            System.out.println("Negativo");
        }
    }
}
