package com.java.modulo09.consencap.exercicios.exercicio02;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Curso:");
        String nome = scan.nextLine();

        System.out.println("Horário:");
        String horario = scan.nextLine();

        System.out.println("Professor:");
        String nomeProf = scan.nextLine();

        System.out.println("Departamento:");
        String departamentoProf = scan.nextLine();

        System.out.println("Email:");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamentoProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("---Alunos----");

        Aluno[] alunos = new Aluno[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com nome do Aluno" + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do Aluno" + (i + 1));
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite as notas:" + (j + 1));
                notas[i] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());

    }

}
