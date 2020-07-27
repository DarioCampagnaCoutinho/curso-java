package com.java.modulo09.consencap.exercicios.exercicio02;

/**
 *
 * @author dario
 */
public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome Curso:" + this.nome + "\n";

        if (professor != null) {
            info += professor.obterInfo();
        }

        if (alunos != null) {
            System.out.println("---Alunos---");
            for (Aluno al : alunos) {
                if (al != null) {
                    info += al.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da Turma:"+obterMediaTurma();
        }

        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno al : alunos) {
            if (al != null) {
                soma += al.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}
