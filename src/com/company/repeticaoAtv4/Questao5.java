package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        double A = scan.nextDouble();
        System.out.println("Digite o valor B: ");
        double B = scan.nextDouble();
        System.out.println("Digite o valor C: ");
        double C = scan.nextDouble();
        System.out.println();
        System.out.printf("Área de um triângulo retângulo %.3f %n : ", (A*C)/2);
        System.out.printf("Área do círculo : %.3f %n ", 3.14159 * Math.pow(C,2))   ;
        System.out.printf("Área do trapézio : %.3f %n", ((A+B)*C)/2);
        System.out.printf("Área de um quadrado : %.3f %n", B*B);
        System.out.printf("Área de um triângulo retângulo : %.3f %n ", A*B);

    }
        }
