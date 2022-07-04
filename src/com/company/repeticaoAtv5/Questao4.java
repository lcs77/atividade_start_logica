package com.company.repeticaoAtv5;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        System.out.println("Digite o valor em R$: ");
        int rs = scan.nextInt();

        while (rs>=100){
            nota100++;
            rs-=100;}
        while (rs>=50){
            nota50++;
            rs-=50;}
        while (rs>=20){
            nota20++;
            rs-=20;}
        while (rs>=10){
            nota10++;
            rs-=10;}
        while (rs>=5){
            nota5++;
            rs-=5;}
        while (rs>=2){
            nota2++;
            rs-=2;}
        while (rs>=1){
            nota1++;
            rs-=1;}

        System.out.println( nota100+ " Notas de R$: 100");
        System.out.println( nota50+ " Notas de R$: 50");
        System.out.println( nota20+ " Notas de R$: 20");
        System.out.println( nota10+ " Notas de R$: 10");
        System.out.println( nota5+ " Notas de R$: 5");
        System.out.println( nota2 + " Notas de R$: 2");
        System.out.println( nota1 + " Notas de R$: 1");
    }}
