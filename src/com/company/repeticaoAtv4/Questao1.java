package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o raio: ");
        double raio = scan.nextDouble();
        double area = Math.PI* (raio*raio);
        System.out.println(area);

    }
}
