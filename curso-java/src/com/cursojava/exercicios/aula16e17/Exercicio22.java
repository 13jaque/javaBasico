package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de cds: ");
        int cds = scan.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= cds; i++){

            System.out.println("Informe o valor do cd: " +i);
           preco = scan.nextDouble();

           soma += preco;
        }

        double media = soma / cds;

        System.out.println("media:" +media);
    }
}
