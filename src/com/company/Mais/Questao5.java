package com.company.Mais;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("Digite outro número número: ");
        int numero2 = scan.nextInt();
        int soma= 0;

        if(numero>numero2){
            for (int  i =numero2+1; i<numero;i++){
                if (i%2==1||i%2==-1){
                    soma+=i;}}}


        else if(numero<numero2){
            for (int  i =numero+1; i<numero2;i++){
                if (i%2==1||i%2==-1){
                    soma+=i;}}}


        System.out.println(soma);

    }
}
