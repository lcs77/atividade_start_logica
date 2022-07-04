package com.company.repeticaoAtv1;

public class Questao4 {
    public static void main(String[] args) {
        int somaImpar=0;
        for(int i =57; i<= 901;i++ ){
            if (i%2==1)
                somaImpar+=i;
        }
        System.out.println(somaImpar);
    }
}
