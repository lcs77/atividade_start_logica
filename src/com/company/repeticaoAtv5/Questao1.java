package com.company.repeticaoAtv5;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor x1: ");
        double x1 = scan.nextDouble();
        System.out.println("Digite o valor x2: ");
        double x2 = scan.nextDouble();
        System.out.println("Digite o valor y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Digite o valor y1: ");
        double y2 = scan.nextDouble();

        double resultado = Math.sqrt((Math.pow(x1-x2,2)+(Math.pow(y1-y2,2))));
        System.out.printf(" %.4f %n",resultado);
    }
}
