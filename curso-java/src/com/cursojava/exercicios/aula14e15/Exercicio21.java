package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tipo de combustivel (alcool/gasolina): ");
        String tipoCombustivel = scan.next();

        System.out.println("litros de combustivel: ");
        double litros = scan.nextDouble();

       double alcool = 1.90;
       double gasolina = 2.50;
       int desconto = 0;
       double total = 0;
       double totalDesconto = 0;

       if (tipoCombustivel.equalsIgnoreCase("a")) {

           if (litros <= 20) {
               desconto = 3;
           } else {
               desconto = 5;
           }
           total = litros * alcool;
       }
       else if (tipoCombustivel.equalsIgnoreCase("g")){
               if (litros <= 20){
                   desconto = 4;
               }else {
                   desconto = 6;
               }
           total = litros * gasolina;
           }

       totalDesconto = total * desconto / 100;

       double precoApagar = total - totalDesconto;

       System.out.println("Total a ser pago: " + total);
       }
}

