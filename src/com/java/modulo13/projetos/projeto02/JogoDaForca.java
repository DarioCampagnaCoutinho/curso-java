package com.java.modulo13.projetos.projeto02;

import javax.swing.JOptionPane;

public class JogoDaForca {

    static String LeiaPalavra() {
        String palavra = "", armazena_palavra = "";
        boolean verificar = false;
        while (!verificar) {
            palavra = JOptionPane.showInputDialog("Jogo da Forca" + "\n" + "Informa uma Palavra");
            armazena_palavra = palavra.toUpperCase();
            boolean nada = armazena_palavra.equals("");
            boolean verificar_espaço = armazena_palavra.contains(" ");
            if (nada || verificar_espaço) {
                JOptionPane.showMessageDialog(null, "Nehuma palavra, ou tem espaço");
            } else {
                verificar = true;
            }
        }
        return armazena_palavra;
    }

    static String convertePalavra(String armazena_palavra) {
        String asterisco = "";
        for (int i = 0; i < armazena_palavra.length(); i++) {
            asterisco += "*";
        }
        JOptionPane.showMessageDialog(null, asterisco);
        return asterisco;
    }

    static String leiaLetra(String armazena_palavra, String asterisco) {
        String letra = "", armazena_letra = "", letrasErradas = "";
        int tamanhoLetra = 0, erro = 0, chances = 7;
        boolean caracter = false;
        while (!caracter) {
            letra = JOptionPane.showInputDialog("Jogo da Forca" + "\n" + "Digite uma Letra:");
            armazena_letra = letra.toUpperCase();
            tamanhoLetra = armazena_letra.length();
            boolean erroLetra = letrasErradas.contains(armazena_letra);
            boolean verificar_espaçoLetra = armazena_letra.equals(" ");
            if (erroLetra || verificar_espaçoLetra) {
                JOptionPane.showMessageDialog(null, "Letra já foi chutada, ou não tem nada");
            } else if (tamanhoLetra == 1) {
                caracter = true;

                boolean verificarLetra = armazena_palavra.contains(armazena_letra);

                if (verificarLetra) {
                    caracter = false;
                    int indice = armazena_palavra.indexOf(armazena_letra);
                    while (indice != -1) {
                        asterisco = asterisco.substring(0, indice) + armazena_letra + asterisco.substring(indice + 1);
                        JOptionPane.showMessageDialog(null, asterisco);
                        indice = armazena_palavra.indexOf(armazena_letra, indice + 1);
                        caracter = false;
                    }
                    if (asterisco.equals(armazena_palavra)) {
                        JOptionPane.showMessageDialog(null, "PARABENS VC ACERTOU");
                        break;
                    }

                } else {
                    erro++;
                    letrasErradas += armazena_letra;
                    JOptionPane.showMessageDialog(null, "Não existe" + "\n" + "Você tem " + (chances - erro) + " tentativas" + "\n" + "Letras chutadas: " + letrasErradas);
                    if (erro == chances) {
                        JOptionPane.showMessageDialog(null, "Estourou a quantidade de erros \n " + "Letras erradas: " + letrasErradas
                                + "\n" + "Palavra correta: " + armazena_palavra + "\n" + "Total de erros: " + erro);
                        break;
                    }
                    caracter = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "É permitido apenas uma caracter por vez!");
                caracter = false;
            }

        }
        return armazena_letra;
    }

    public static void main(String[] args) {
        String palavra = LeiaPalavra();
        String asterisco = convertePalavra(palavra);
        String letra = leiaLetra(palavra, asterisco);
    }

}
