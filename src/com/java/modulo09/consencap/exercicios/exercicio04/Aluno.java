package com.java.modulo09.consencap.exercicios.exercicio04;

/**
 *
 * @author dario
 */
public class Aluno extends Pessoa{
    
    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
}
