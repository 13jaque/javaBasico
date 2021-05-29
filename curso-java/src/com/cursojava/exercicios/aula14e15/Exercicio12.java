package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora: ");
        double ganhosHora = scan.nextDouble();

        System.out.println("Quanto horas trabalha por mes: ");
        double horaMes = scan.nextDouble();

        double salarioBruto = ganhosHora * horaMes;
        System.out.println("Salario bruto: " + salarioBruto);

        double descontoIr = 0;

        if (salarioBruto <= 900){
            descontoIr = 0;
        }else if (salarioBruto <=1500){
            descontoIr = 5;
        }else if (salarioBruto <= 2500){
            descontoIr = 10;
        }else if (salarioBruto > 2500){
            descontoIr = 20;
        }

        double ir = (salarioBruto * descontoIr) / 100;
        System.out.println("ir: " +ir);

        double inss = (salarioBruto * 10) /100;
        System.out.println("INSS: " + inss);

        double fgts = (salarioBruto * 11) /100;
        System.out.println("FGTS: " +fgts);

        double totalDesconto = inss + ir;
        System.out.println("Total de descontos: " +totalDesconto);

        double salarioLiquido = salarioBruto - totalDesconto;
        System.out.println("Salario Liquido: " +salarioLiquido);
    }
}
