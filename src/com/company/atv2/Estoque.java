package com.company.atv2;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos produtos tem no estoque: ");
        int estoque = scan.nextInt();
        System.out.println("Digite a quantidade máxima de produtos: ");
        int estoqueMaximo = scan.nextInt();
        System.out.println("Digite a quantidade mínima de produtos: ");
        int estoqueMinimo = scan.nextInt();
        int estoqueMedio = (estoqueMaximo+estoqueMinimo)/2;
        if (estoque>=estoqueMedio)
            System.out.println("Não efetuar a compra");
        else
            System.out.println("Efetuar a compra");

    }
}
