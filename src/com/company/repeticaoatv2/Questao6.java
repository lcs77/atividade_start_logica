package com.company.repeticaoatv2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade= 0;
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        double divide;
        for (divide = num/2; divide>1;divide=divide/2){
            quantidade++;

        }
        System.out.println(divide);
        System.out.println(quantidade);
    }
}
