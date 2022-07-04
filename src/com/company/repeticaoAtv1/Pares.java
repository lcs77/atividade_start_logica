package com.company.repeticaoAtv1;

public class Pares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i<=1000;i++){
            if(i%2==0){
            System.out.println(i);
            soma += i;}


        }
        System.out.println(soma);

    }
}
