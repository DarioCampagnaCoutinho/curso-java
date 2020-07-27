package com.java.modulo15.arquivos.exercicios.exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CaminhoOrigem {

	private static final String PASTA_ORIGEM = "C:\\Users\\dario\\OneDrive\\Documentos"
			+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\documentos";
	private static final String PASTA_BACKUP = "C:\\Users\\dario\\OneDrive\\Documentos"
			+ "\\eclipse-jee-neon-2-win32-x86_64\\EclipseJavaEE-Projetos\\documentos_ bkp";

	public static void main(String[] args) {

		/* Cria referencias das pastas */
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
		try {
			/* Verifica se diretorio destino ja existe. */
			if (Files.exists(backup)) {
				System.out.println("Diret�rio " + backup.getFileName() + " j� existe.");
			} else {
				Files.createDirectories(backup);
				System.out.println("Diret�rio " + backup.getFileName() + " criado com suces-so.");
			}
			Stream<Path> streamOrigem = Files.list(origem);
			streamOrigem.forEach(p -> {
				try {
					System.out.println("Copiando arquivo " + p.getFileName());
					Files.copy(p, backup.resolve(p.getFileName()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
