package com.company;

import java.util.Scanner;

public class ClubeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a idade do aluno:");
        int idadeAluno = scan.nextInt();
        switch (idadeAluno){
            case 5,6,7,8,9,10:
                System.out.println("infantil");
                break;
            case 11,12,13,14,15:
                System.out.println("juvenil");
                break;
            case 16,17,18,19,20:
                System.out.println("junior");
                break;
            case 21,22,23,24,25:
                System.out.println("profissional");
                break;
            default:
                System.out.println("digite uma idade válida");
        }

    }
}
