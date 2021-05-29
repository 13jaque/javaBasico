package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Preço do tomate: ");
        double tomate = scan.nextDouble();

        System.out.println("Preço da batata: ");
        double batata = scan.nextDouble();

        System.out.println("Preço da cenoura: ");
        double cenoura = scan.nextDouble();

        if (tomate < batata && tomate < cenoura){
            System.out.println("Tomate é mais barato - " +tomate);
        }else if (batata < tomate && batata < cenoura){
            System.out.println("Batata é mais barato - " +batata);
        }else if (cenoura < tomate && cenoura < batata){
            System.out.println("Cenoura é mais barato - " +cenoura);
        }else {
            System.out.println("Tudo caro!");
        }


    }
}
