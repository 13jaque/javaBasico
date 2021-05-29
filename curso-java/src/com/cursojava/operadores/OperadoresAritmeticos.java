package com.cursojava.operadores;

public class OperadoresAritmeticos {

    public static void main (String[] args){

        int resultado = 1 + 2; // 1 + 2 = 3
        System.out.println(resultado);

        resultado = resultado - 1; // 3 - 1 = 2
        System.out.println(resultado);

        resultado = resultado * 2; // 2 * 2 = 4
        System.out.println(resultado);

        resultado = resultado / 2; // 4 / 2 = 2
        System.out.println(resultado);

        resultado = resultado + 8; // 8 + 2 = 10
        System.out.println(resultado);

        resultado = resultado % 7; // 10 / 7 = 1 e resto % = 3
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);


        resultado = resultado + 1;
        System.out.println(resultado);

        resultado ++;
        System.out.println(resultado);

        System.out.println(resultado ++);
        //mesma coisa que:
        //System.out.println(resultado);
        //resultado = resultado +1;
        //resultado +=1;

        System.out.println(++resultado);
        //mesma coisa que:
        //resultado += 1;
        //System.out.println(resultado);

        resultado --;
        System.out.println(resultado);

        System.out.println(resultado --);
        System.out.println(--resultado);







    }
}
