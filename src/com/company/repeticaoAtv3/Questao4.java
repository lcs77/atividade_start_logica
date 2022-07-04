package com.company.repeticaoAtv3;

public class Questao4 {
    public static void main(String[] args) {
        int i = 57;
        int soma = 0;
        while (i <=901) {
        if (i%2==1){
            System.out.println(i);
            soma+=i;
        }
        i++;}
        System.out.println(soma);
    }
}
