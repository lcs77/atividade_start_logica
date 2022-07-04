package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Digite a matrícula do funcionário: ");
        int matricula = scan.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        int horas = scan.nextInt();
        System.out.println("Digite o valor das horas trabalhadas: ");
        double valorHoras = scan.nextDouble();
        double salarioBasico = valorHoras*horas;
        System.out.println("Matricula: " + matricula);
        System.out.println("Salário Bruto R$: " + salarioBasico);
    }
}
