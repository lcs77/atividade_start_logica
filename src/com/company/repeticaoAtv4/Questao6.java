package com.company.repeticaoAtv4;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        double A = scan.nextDouble();
        System.out.println("Digite o valor B: ");
        double B = scan.nextDouble();
        System.out.println("Digite o valor C: ");
        double C = scan.nextDouble();

        if (A>B&&A>C){
            System.out.println(A+" é maior");}
        else if (B>A&&B>C){
            System.out.println(B+" é maior");}
        else if (B==A&&B==C&&A==C){
            System.out.println(B+" é maior");}
        else
            System.out.println(C+" é maior");
    }
}
