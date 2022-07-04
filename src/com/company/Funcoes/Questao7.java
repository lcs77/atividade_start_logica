package com.company.Funcoes;

import java.util.Scanner;

public class Questao7 {
    public static void baskara(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de ponto flutuante: ");
        double A = scan.nextDouble();
        while (A==0){
            System.out.println("Erro , digite um número maior que '0' ");
            A = scan.nextDouble();
        }
        System.out.println("Digite um número de ponto flutuante: ");
        double B = scan.nextDouble();
        System.out.println("Digite um número de ponto flutuante: ");
        double C = scan.nextDouble();


        double delta = Math.pow(B,2)-4*(A*C);
        if (delta>=0){
            double bascara = ((-B)+Math.sqrt(delta))/2*A;
            double bascara2 = ((-B)-Math.sqrt(delta))/2*A;
            System.out.println("R1"+bascara);
            System.out.println("R2"+bascara2);
        }else
            System.out.println("Delta menor que '0' ");
    }

    public static void main(String[] args) {
        baskara();
    }
}
