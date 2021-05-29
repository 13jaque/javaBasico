package com.cursojava.exercicios.aula13;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro: ");
        int numInteiro1 = scan.nextInt();

        System.out.println("Informe o segundo numero inteiro: ");
        int numInteiro2 = scan.nextInt();

        System.out.println("Informe um numero real: ");
        double numReal = scan.nextInt();

        //a
        int produto1 = (numInteiro1 * 2) * (numInteiro2 / 2);
        //b
        double produto2 = (numInteiro1 * 3) + numReal;
        //c Math.pow(base, expoente) - base = numero - expoente = elevado
        double produto3 = Math.pow(numReal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " +produto1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + produto2);
        System.out.println("O terceiro elevado ao cubo: " + produto3);
    }
}
