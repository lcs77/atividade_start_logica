package com.company.repeticaoAtv1;

public class SomaImpartdpar {
    public static void main(String[] args) {
        int quantidadePar = 0;
        int somaImpar = 0;
        for (int i =100 ;i <=1500; i++){
            if (i%2==1)
                somaImpar += i;
                //System.out.println(somaImpar);
            else if (i%2==0)
                quantidadePar = quantidadePar+1;
        }
        System.out.println("A soma dos números pares: " +somaImpar);
        System.out.println("A quantidade de números pares: "+quantidadePar);
    }
}
