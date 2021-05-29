package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if (ano % 400 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("Bissexto");
        }else{
            System.out.println("Não é Bissexto");
        }

    }
}
