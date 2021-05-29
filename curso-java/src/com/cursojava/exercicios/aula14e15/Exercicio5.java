package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextInt();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextInt();

        double media = (nota1 + nota2) /2;
        System.out.println("notal final:" +media);

        if (media == 10){
            System.out.println("Aprovado com Distinção!");
        }else if (media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
