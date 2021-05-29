package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        double salario = scan.nextDouble();
        //double aumento = salario + 20 /100;

        int percentual = 0;
        if (salario <= 280){
            percentual = 20;
        }else if (salario > 280 && salario <= 700){
            percentual = 15;
        }else if (salario > 700 && salario <= 1500){
            percentual = 10;
        }else if (salario >= 1500){
            percentual = 5;
        }

        double aumento = (salario * percentual) / 100;
        double novoSalario = salario + aumento;

        System.out.println("Salario atual: " +salario);
        System.out.println("Percentual: " +percentual);
        System.out.println("Valor do aumento: " +aumento);
        System.out.println("Valor do novo salario: " +novoSalario);
    }
}
