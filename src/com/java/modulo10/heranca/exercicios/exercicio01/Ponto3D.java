package com.java.modulo10.heranca.exercicios.exercicio01;

public class Ponto3D extends com.java.modulo10.heranca.exercicios.exercicio01.Ponto2D {

	private double z;

	public Ponto3D(double x, double y, double z) {
		super(x, y);
		
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public String toString() {
		return super.toString() + ", z = " + z;
	}
}
