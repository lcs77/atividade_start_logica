package com.company.Funcoes;

import java.util.Scanner;

public class Questao3 {
    public static void LadosTriangulo(double A, double B, double C) {
        double aux;

        if(A > B && B > C){
            aux = A;
            A = B;
            B = aux;
        }else if(C > A){
            aux = A;
            A = C;
            C = aux;
        }if(A >= (B + C)){
            System.out.println("NÃO FORMA TRIÂNGULO");
        }else{
            if(Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C,2))){
                System.out.println("É UM TRIÂNGULO RETÂNGULO");
            }if(Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))){
                System.out.println("É UM TRIÂNGULO OBTUSANGULO.");
            }if(Math.pow(A, 2) <= (Math.pow(B, 2) + Math.pow(C, 2))){
                System.out.println("É TRIÂNGULO ACUTANGULO.");
            }if(A == B && B == C){
                System.out.println("É TRIÂNGULO EQUILATERO.");
            }if(( A == B && A != C ) || ( A == C && A != B ) || ( B == C && B != A )){
                System.out.println("É TRIÂNGULO ISOSCELES.");
            }if(C > A && B > A){
                System.out.println("ERRO, C e B, não podem ser maiores que A.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        double A = scan.nextDouble();
        System.out.println("Informe o valor de B: ");
        double B = scan.nextDouble();
        System.out.println("Informe o valor de C: ");
        double C = scan.nextDouble();
        LadosTriangulo(A, B, C);
    }}