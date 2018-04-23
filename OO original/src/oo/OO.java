/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author Douglas
 */
public class OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.setNome("Kennedy");
        pessoa1.setTelefone("61991998496");
        pessoa1.setEndereco("Riacho Fundo");
        pessoa1.setSexo("Masculino");
        pessoa1.setConta ( new Conta());
        pessoa1.getConta().setBanco("BRB");
        pessoa1.getConta().setAgencia(123);
        pessoa1.getConta().setConta(12245);
        pessoa1.getConta().setSaldo(100);
    
        Pessoa pessoa2 = new Pessoa();
    
        pessoa2.setNome("Lucas");
        pessoa2.setTelefone("619919945596");
        pessoa2.setEndereco("Recanto das Emas");
        pessoa2.setSexo("Masculino");
        pessoa2.setConta ( new Conta());
        pessoa2.getConta().setBanco("CAIXA");
        pessoa2.getConta().setAgencia(325);
        pessoa2.getConta().setConta(8855);
        pessoa2.getConta().setSaldo(300);
    
    
        pessoa1.getConta().transferir(pessoa1.getConta(), 200);
        pessoa2.getConta().transferir(pessoa1.getConta(), 400);
        

        System.out.println(pessoa1.getConta().getSaldo());
        System.out.println(pessoa2.getConta().getSaldo());
        
        
    

        
        // o que é classe ? definição dos objetos
        // o que é objeto ? uma instância da classe
        // o que é método ? método é uma fucionalidade de uma classe 
        
    }
    
    
}
