package br.unipar.vetores;

import java.util.Scanner;

public class Vetorr {

    public static void main (String[] args){

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;

        double[] notas = new double[5];
        notas[0] = 1.1;
        notas[1] = 65;
        notas[2] = 4;
        notas[3] = 4.8;
        notas[4] = 59;

        double media = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];

        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o 1 nome: ");
        nomes[0] = sc.next();

        System.out.println("informe o 2 nome: ");
        nomes[1] = sc.next();

        System.out.println("informe o 3 nome: ");
        nomes[2] = sc.next();

        System.out.println("informe o 4 nome: ");
        nomes[3] = sc.next();

        System.out.println("informe o 5 nome: ");
        nomes[4] = sc.next();

        System.out.println("A nota do " + nomes[0] + " é " + notas[0]);
        System.out.println("A nota do " + nomes[1] + " é " + notas[1]);
        System.out.println("A nota do " + nomes[2] + " é " + notas[2]);
        System.out.println("A nota do " + nomes[3] + " é " + notas[3]);
        System.out.println("A nota do " + nomes[4] + " é " + notas[4]);
}}
