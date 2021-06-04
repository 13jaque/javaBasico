package com.cursojava.exercicios.aula16e17;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de idades: ");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;

        for (int i =1; i < idades; i++) {
            System.out.println("Entre com a idade " + i);
            idade = scan.nextInt();

            soma += idade;
        }

        double media = soma / idades;

        if (media >= 0 && media <= 25) {
            System.out.println("jovem");
        }else if (media >=  26&& media <= 60){
            System.out.println("adulta");
        }else if (media > 60){
            System.out.println("idosa");
        }
    }
}