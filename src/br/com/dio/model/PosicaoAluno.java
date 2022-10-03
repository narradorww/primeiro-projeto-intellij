package br.com.dio.model;

// iterandoum array usando for

public class PosicaoAluno {
    public static void main(String[] args) {
        String alunos [] = {"José", "Maria", "João", "Luiz"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[ x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
