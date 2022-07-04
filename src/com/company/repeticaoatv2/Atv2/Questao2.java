package com.company.repeticaoatv2.Atv2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double positivo = 0;
        double negativo= 0;
        double par = 0;
        double impar = 0;
        for(int i = 0; i<=4;i++){
            System.out.println("Digite um numero");
            int num = scan.nextInt();
            if (num>=0) {
                positivo++;
            }else {
                negativo++;}
            if (num%2==0){
                par++;}
            else
                impar++;
        }
        System.out.println("Números positivos: "+positivo);
        System.out.println("Números negativos: "+negativo);
        System.out.println("Números pares: "+par);
        System.out.println("Números ímpares: "+impar);
    }
}
