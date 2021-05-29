package com.cursojava.exercicios.aula13;


import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        /*double pi = 3.14;
        double raio = 10;
        double area = pi * raio;
        double total = area * raio;

        System.out.println(area);*/

        //usando Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio = scan.nextDouble();

        double pi = 3.14;
        double area = pi * raio;
        double total = area * raio;

        System.out.println(" A area é : " +total);



    }
}
