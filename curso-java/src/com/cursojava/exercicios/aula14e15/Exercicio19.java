package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o 1°numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o 2°numero: ");
        int num2 = scan.nextInt();

        System.out.println("Qual opercação: ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao){
            case "+": resultado = num1 + num2;break;
            case "-": resultado = num1 - num2;break;
            case "*": resultado = num1 * num2;break;
            case "/": resultado = num1 / num2;break;
            default:
                System.out.println("Operação invalida");
                valida = false;

        }

        System.out.println("Resultado: " +resultado);

        if (resultado % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Par");
        }

        if(resultado < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
    }
}
