package com.castelo;

import com.castelo.dao.PessoaDAO;
import com.castelo.dao.PessoaPojo;
import com.castelo.pessoa.Pessoa;

public class App {
    public static void main( String[] args )
    {
        /*
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("jorge");
        pessoa.setEndereco("rua wy");
        pessoa.setIdade(20);

        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setIdade(pessoa.getIdade());

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.cadastrarPessoa(pessoaPojo);
        */
    
    

        Pessoa pessoa = new Pessoa();
        pessoa.setId(3);

        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setId(pessoa.getId());       

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.consultarPessoa(pessoaPojo);
    
    
        
    
    
    
    
    }






}

