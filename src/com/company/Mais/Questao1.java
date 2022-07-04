package com.company.Mais;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salário");
        double salario = scan.nextDouble();

        if (salario>=0&&salario<2000.0){
            System.out.println("Contribuinte isento de taxas");
        }else if(salario>=2001&&salario<=3000.0){
            System.out.printf("R$ : "+" %.2f %n" ,(salario*0.08) );}
        else if(salario>=3001&&salario<4500.0){
            System.out.printf("R$ : "+" %.2f %n"  ,salario*0.18);}
        else if(salario>=4501){
            System.out.printf("R$ : "+" %.2f %n"  , salario*0.28);}
    }
}
