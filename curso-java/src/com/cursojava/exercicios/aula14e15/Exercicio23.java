package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tipo da carne (File Duplo/Alcatra/Picanha): ");
        String tipoCarne = scan.next();

        System.out.println("Quantidade (kg) carne: ");
        double qtCarne = scan.nextInt();

        double valorCarne = 0;
        double totalParcial = 0;

        if (tipoCarne.equalsIgnoreCase("fileDuplo")) {
            if (qtCarne <= 5) {
                valorCarne = 4.90;
            } else {
                valorCarne = 5.80;
            }
            totalParcial = qtCarne * valorCarne;
        } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
            if (qtCarne <= 5) {
                valorCarne = 5.90;
            } else {
                valorCarne = 6.80;
            }
            totalParcial = qtCarne * valorCarne;
        } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
            if (qtCarne <= 5) {
                valorCarne = 6.90;
            } else {
                valorCarne = 7.80;
            }
            totalParcial = qtCarne * valorCarne;
        }
        System.out.println("Tipo da carne: " +tipoCarne);
        System.out.println("Quantidade (kg) carne: " +qtCarne);
        System.out.println("Preço total: " +totalParcial);

        System.out.println("Compra feito no cartão Tabajara? ");
        String cartão = scan.next();

        if (cartão.equalsIgnoreCase("s")){
            double desconto = (totalParcial * 5 / 100);
            System.out.println("Valor do desconto: " +desconto);
            System.out.println("Valor a pagar: " +(totalParcial - desconto));
        }else{
            System.out.println("Valor a pagar: " +totalParcial);
        }
    }
}
