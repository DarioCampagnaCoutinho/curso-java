package com.java.modulo12.utilitarios.stringbuilder;

public class Aula01 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			sb.append("X");
		}
		
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("A" + sb);
		
	}
}
