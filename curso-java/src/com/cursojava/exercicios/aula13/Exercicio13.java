package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora: ");
        double salarioHora = scan.nextDouble();

        /*System.out.println("Quantas horas trabalha por dia: ");
        int horasDia = scan.nextInt();
        int totalHorasMes = horasDia * 26;
        System.out.println(totalHorasMes + " Hrs p/ mes.");*/

        System.out.println("Quantas horas trabalha no mes: ");
        int horasMes = scan.nextInt();

        double salarioMes = salarioHora * horasMes;
        System.out.println("Salario por mes: " + salarioMes);

        double impostoRenda = salarioMes * 11 / 100;
        System.out.println("Imposto de renda: " + impostoRenda);

        double inss = salarioMes * 8 / 100;
        System.out.println("Inss: " + inss);

        double sindicato = salarioMes * 5 / 100;
        System.out.println("Sindicato: " + sindicato);

        //%.1f - mostra apenas 1 casa depois da virgula / %n pula linha
        double descontos = impostoRenda + inss + sindicato;
        System.out.printf("Total desconto: %.1f%n", descontos);

        double totalDescontoSalario = salarioMes - descontos;
        System.out.println("Salario liquido: " + totalDescontoSalario);



    }
}
