package com.company.atv1;

import java.util.Scanner;

public class VendaCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salario = 1200;

        System.out.println("Quantos carros você vendeu: ");
        int carrosVendidos = scan.nextInt();
        double comissaoFixa = 200 * carrosVendidos;
        System.out.println("Qual é o valor total: ");
        double totalVendidos = scan.nextInt();
        double valorVendidos = totalVendidos*0.05;


        System.out.println("Salário base: " +salario+ "\n Comissão fixa R$: " + comissaoFixa+ "\n" +
                "Comissão por vendas R$: " + valorVendidos+"\n Valor total R$: " + (salario+valorVendidos+comissaoFixa));

    }
}
