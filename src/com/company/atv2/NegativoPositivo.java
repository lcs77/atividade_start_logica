package com.company.atv2;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();
        if (valor>=0)
            System.out.println("valor positivo");
        else
            System.out.println("valor negativo");
    }
}
