package com.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        int ganhoPorHora = scan.nextInt();

        /*System.out.print("Quantas horas trabalha por dia: ");
        int horasTrabalhaDia = scan.nextInt();
        int totalTrabralhoHorasDias = horasTrabalhaDia * 26;
        System.out.print("Total de horas trabalhadas por mes: " + totalTrabralhoHorasDias);*/

        System.out.print("\nQual é o numero de horas trabalhadas/mes:" );
        int horasTrabalhadasMes = scan.nextInt();
        int horasMes =horasTrabalhadasMes * ganhoPorHora;

        System.out.print("Total do salario no mes: " + horasMes + " reais");
    }
}
