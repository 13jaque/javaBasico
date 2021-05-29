package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Infome o metro: ");
        double metro = scan.nextInt();

        double centimetros = metro * 100;


        String m = "m = ";
        String cm = "cm";

        System.out.println(metro + m + centimetros + cm);

        //Sem o Scanner
        /*int centimetros = 2 * 100;

        String cm = "cm";

        System.out.println(centimetros + cm);*/
    }
}
