package com.java.modulo09.consencap.exercicios.exercicio05;

/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Dario Campagna");
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Leão");
        endereco.setEmail("gmail@.com");
        
        contato.setEndereco(endereco);
        
        Telefone telefone1 = new Telefone();
        telefone1.setId("1");
        telefone1.setNumeros("999999");
        
        Telefone telefone2 = new Telefone();
        telefone2.setId("1");
        telefone2.setNumeros("999999");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone1;
        telefones[1] = telefone2;
        
        contato.setTelefones(telefones);
        
        System.out.println("Nome = "+contato.getNome());
        if(contato != null && contato.getEndereco() != null){
            System.out.println("Rua = "+contato.getEndereco().getRua());
        }
        if(contato != null && contato.getEndereco() != null){
            System.out.println("Email = "+contato.getEndereco().getEmail());
        }
        
        if(contato != null && contato.getTelefones()!= null){
            for(Telefone t : contato.getTelefones()){
                System.out.println("Id:"+t.getId()+"\nTelefones:"+t.getNumeros());
            }
        }
        
        
    }
    
}
