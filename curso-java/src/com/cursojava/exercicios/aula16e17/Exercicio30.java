package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero para gerar a tabuada: ");
        int num = scan.nextInt();

        boolean invalido = true;
        int inicio, fim;

        do {

            System.out.println("Informe o inicio da tabuada: ");
            inicio = scan.nextInt();

            System.out.println("Informe o final da tabuada: ");
            fim = scan.nextInt();

            if (fim > inicio){
                invalido = false;
            }

        }while (invalido);

        System.out.println("A tabuada de " + num + ":");
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println();

        for (int i = inicio; i <= fim; i++){

            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
