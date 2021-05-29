package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo p/ download: " );
        double arquivo = scan.nextInt();

        System.out.println("Velocidade da internet: ");
        double velocidade = scan.nextInt();

        double tempo = arquivo / velocidade;

        System.out.println("Tempo de download: " + tempo);



    }
}
