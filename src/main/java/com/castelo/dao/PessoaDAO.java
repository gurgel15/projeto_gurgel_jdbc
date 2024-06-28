package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.castelo.conexao.Conexao;
import com.castelo.pessoa.Pessoa;

public class PessoaDAO {

    public void cadastrarPessoa(PessoaPojo pessoaPojo) {
        Conexao conexao = new Conexao ();
        String sql = "Insert into pessoa(nome, endereco, idade) values (?, ?, ?)";
        PreparedStatement ps = null;       
            try {
                ps = conexao.getConexao().prepareStatement(sql);

                
                ps.setString(1, pessoaPojo.getNome());
                ps.setString(2, pessoaPojo.getEndereco());
                ps.setInt(3, pessoaPojo.getIdade());

                ps.execute();
                ps.close();

                System.out.println("Dados inseridos com sucesso");
                
            } catch (Exception e) {                
                e.printStackTrace();
                System.out.println("Ocorreu um erro com os dados.");
            }
    }


    public void consultarPessoa(PessoaPojo pessoaPojo) {
        Conexao conexao = new Conexao ();
        PreparedStatement ps = null;
        ResultSet resultSet = null;       
        String sql = "SELECT * FROM pessoa WHERE id = ?";
            try {
                ps = conexao.getConexao().prepareStatement(sql);

                
                ps.setInt(1, pessoaPojo.getId());             

                resultSet = ps.executeQuery(sql);
            
                while (resultSet.next()) {
                   pessoaPojo.setId(resultSet.getInt(1));
                   pessoaPojo.setNome(resultSet.getString(2));
                   pessoaPojo.setEndereco(resultSet.getString(3));
                   pessoaPojo.setIdade(resultSet.getInt(4));

                  /*Pessoa pessoa = new Pessoa();
                    pessoa.setId(id);
                    pessoa.setNome(nome);
                    pessoa.setEndereco(endereco);
                    pessoa.setIdade(idade);*/


                    
                } 

                

                ps.close();

                System.out.println("Dados consultados com sucesso");
                
            } catch (Exception e) {                
                e.printStackTrace();
                System.out.println("Ocorreu um erro com os dados.");
            }
    }
}