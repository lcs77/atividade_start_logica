package com.company.repeticaoAtv5;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a velocidade km/h: ");
        double kmhoras = scan.nextDouble();
        System.out.println("Digite o valor de horas percorridas: ");
        double horas= scan.nextDouble();

        double litrosGastos = (kmhoras*horas)/12;
        System.out.printf(" %.3f %n", litrosGastos);
    }
}
