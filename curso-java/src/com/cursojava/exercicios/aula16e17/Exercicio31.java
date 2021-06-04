package com.cursojava.exercicios.aula16e17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario = 1000;//95

        double percetual = 1.5;//96

        salario += (salario/100) * percetual;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i <= 2015; i ++){

            percetual *=2;

            salario += (salario/100) * percetual;

            System.out.println(i + " = " + format.format(salario) + " - " + percetual + "%");
        }
    }
}
