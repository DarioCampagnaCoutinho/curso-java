package com.java.modulo17.colecoes.exercicios.exercicio01;

import java.util.HashMap;

public class Exercicio1 {
	
	public static void main(String[] args) {
        HashMap<String, Integer> pessoaMap = new HashMap<>();         
        pessoaMap.put("Roberto", 35);         
        pessoaMap.put("Gabriel", 18);         
        pessoaMap.put("Carla", 26);         
        pessoaMap.put("Bruna", 17);
        System.out.println(" -- Pessoas -- ");         
        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));     }

}
