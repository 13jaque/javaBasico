package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("kg em morango: ");
        int qtMorango = scan.nextInt();

        System.out.println("kg em maça: ");
        int qtMaca = scan.nextInt();

        double valorMorango = 0;

        if (qtMorango <= 5) {
            valorMorango = 2.50;
        } else {
            valorMorango = 2.20;
        }

        double valorMaca = 0;
        if (qtMaca <= 5){
            valorMaca = 1.80;
        }else {
            valorMaca = 1.50;
        }

        double valorTotalMorango = qtMorango * valorMorango;
        double valorTotalMaca = qtMaca * valorMaca;
        double valorParcial = valorMorango + valorMaca;

        double valorTotal = 0;

        if (qtMorango + qtMaca > 8 || valorParcial > 25){
            valorTotal = valorParcial - (valorParcial *10) / 100;
        }

        System.out.println("Preço total: " +valorTotal);



    }
}
