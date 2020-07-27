package com.java.modulo17.colecoes.exercicios.exercicio02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
        ArrayList<Estudante> list = new ArrayList<>();         
        list.add(new Estudante("Joana", 8.5, 8.5));         
        list.add(new Estudante("Ant�nio", 6.0, 9.0));         
        list.add(new Estudante("Mariana", 7.5, 9.0));         
        list.add(new Estudante("Ricargo", 7.0, 6.0));         
        list.add(new Estudante("Gustavo", 9.5, 10.0));
        list.forEach(e -> e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));
        System.out.println("M�dia dos alunos:");         
        System.out.println("-----------------");
        list.forEach(e -> System.out.println(e.getNome() + ": " + e.getMedia()));     }

}
