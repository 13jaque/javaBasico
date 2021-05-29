package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //(20 °C × 9/5) + 32 = 68 °F
        System.out.println("Digite a temperatura em Graus Celsius: ");
        int celsius = scan.nextInt();

        int fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit é: " + fahrenheit + "°F");


        //sem Scanner
        /*int celsius = 20;
        int fahrenheit = (celsius * 9/5) + 32;

        System.out.println(fahrenheit + "°F");*/
    }

}
