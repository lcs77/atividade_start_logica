package com.company.Mais;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media=0;
        double soma=0;
        double quantidade=0;


     for (int i =0 ; i <=6; i++){

        System.out.println("Digite um número: ");
        double A = scan.nextDouble();
        if (A>=0){
            soma+=A;
            quantidade++;
            media = soma/quantidade;
        }


     }
        System.out.println(quantidade + " Valores positivos");
        System.out.printf("%.2f %n",media);


    }
}
