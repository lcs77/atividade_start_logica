package com.company.repeticaoAtv5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int segundos = 0;
        int minutos = 0;
        int horas = 0;


        System.out.println("Informe a quantidade de segundos: ");
        double controle = scan.nextDouble();
        while (controle > 0){
            controle--;
            segundos++;
            if (segundos >= 60){
                minutos++;
                segundos =0;
            }
            if(minutos>=60){

                minutos=0;
                horas+=1;
            }}
        System.out.println(horas +" : "+minutos+" : "+segundos);

    }
}
