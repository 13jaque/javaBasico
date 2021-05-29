package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio9 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //(75 °F − 32) × 5/9 = 23°C
        System.out.print("Digite a temperatura em Graus Farenheit: ");
        int f = scan.nextInt();

        int c = (f - 32) * 5/9;

        System.out.print("Temperatura em Graus Celsius é: " + c + "°C");


        //sem Scanner
        /*int farenheit = 75;
        int graus = (farenheit - 32) * 5/9;
        System.out.print(graus+ "°C");*/
    }
}
