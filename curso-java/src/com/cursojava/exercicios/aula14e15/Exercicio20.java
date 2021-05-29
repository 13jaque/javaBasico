package com.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para vitima? ");
        String a = scan.next();

        System.out.println("Esteve no local do crime? ");
        String b = scan.next();

        System.out.println("Mora perto da vitima? ");
        String c = scan.next();

        System.out.println("Devia para a vitima? ");
        String d = scan.next();

        System.out.println("Já trabalhou com a vitima? ");
        String e = scan.next();

        int cont = 0;

        if (a.equalsIgnoreCase("S")) {
            cont ++;

        }
        if (b.equalsIgnoreCase("S")) {
            cont ++;

        }
        if (c.equalsIgnoreCase("S")) {
            cont ++;

        }
        if (d.equalsIgnoreCase("S")) {
            cont ++;

        }
        if (e.equalsIgnoreCase("S")) {
            cont ++;

        }
        if (cont == 2){
            System.out.println("Suspeito");
        }else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        }else if (cont == 5){
            System.out.println("Assassino");
        }else{
            System.out.println("Inocente");
        }
    }

}
