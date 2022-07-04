package com.company.atv1;

import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva a base: ");
        double base = scan.nextDouble();
        System.out.println("escreva a altura: ");
        double altura = scan.nextDouble();
        System.out.println("A área do retângulo é : " + base* altura);

    }
}
