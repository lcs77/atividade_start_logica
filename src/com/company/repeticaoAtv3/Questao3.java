package com.company.repeticaoAtv3;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos tem na sua turma: ");
        int numeroAlunos = scan.nextInt();
        int quantidadeAprovados =0;
        int quantidadeReprovados = 0;

        while (numeroAlunos>0){
            System.out.println("Digite o nome do aluno: ");
            String aluno= scan.next();
            System.out.println("Digite a matrícula do aluno: ");
            int matricula = scan.nextInt();
            System.out.println("Digite a nota1 do aluno: ");
            double nota1 = scan.nextInt();
            System.out.println("Digite a nota2 do aluno: ");
            double nota2 = scan.nextInt();
            System.out.println("Digite a nota3 do aluno: ");
            double nota3 = scan.nextInt();
            if (nota1>10 || nota2 > 10 || nota3>10||nota1<0||nota2<0||nota3<0){
                System.out.println("Nota inválida , digite uma nota >= 0 ou <=10");
                continue;
            }
            double finalMedia=((2 * nota1) +(3* nota2) +(4* nota3)) / 9;


            if (finalMedia<5){
                System.out.println(" Aluno: " + aluno+"\n Matrícula: " + matricula+"\n Média do aluno : " + finalMedia+"\n " +
                        "Status:REPROVADO ");
                quantidadeReprovados++;
                System.out.println();
            } else{
                System.out.println(" Aluno: " + aluno+"\n Matrícula: " + matricula+"\n Média do aluno : " + finalMedia+"\n " +
                        "Status:APROVADO ");
                System.out.println();
                quantidadeAprovados++;}
            numeroAlunos--;
        }
        System.out.println("QUantidade de aprovados: "+quantidadeAprovados);
        System.out.println("Quantidade de reprovados: "+quantidadeReprovados);
    }
}
