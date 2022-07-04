package com.company.projetoLogica;

public class Questao2 {
    public static void main(String[] args) {

        int vetor1[] = new int[]{4,5,8,6};
        int vetor2[] = new int[]{8,9,2,6};
        int vetor3[] = new int[4];

        for (int x=0; x < 4; x++){
            vetor3[x] = vetor1[x] + vetor2[x];
            System.out.println(vetor3[x]);
        }

    }

}
