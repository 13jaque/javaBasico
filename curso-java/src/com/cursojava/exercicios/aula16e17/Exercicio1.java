package com.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota entre 0 e 10: ");
            double nota = scan.nextInt();

            if (nota >= 0 && nota <=10){
                System.out.println("Nota valida: " +nota);
                notaValida = true;
            }else{
                System.out.println("Nota invalida!");
            }
        }while (!notaValida);

    }
}
