package com.cursojava.exercicios.aula16e17;

public class Exercicio4 {

    public static void main (String [] args){

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){

            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }

        System.out.print("População A: " + popA);
        System.out.print("População B: " + popB);
        System.out.print("Qtd anos: " + cont);
    }
}
