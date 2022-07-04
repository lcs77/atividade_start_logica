package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();
        double volume = (3/4.0) *3.14159* Math.pow(raio,3);
        System.out.printf("O volume %.3f %n",volume);
    }
}
