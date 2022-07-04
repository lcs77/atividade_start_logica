package com.company.projetoLogica;

public class Questao1 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i = 0; i<10;i++){
            vetor[i]=i;
            System.out.println(vetor[i]);
        }
        int e[] = vetor;
        System.out.println();

        for (int i = 0; i<e.length;i++){
            vetor[i]=i;
            System.out.println(e[i]);
        }
    }
}
