package br.edu.utfpr.repository;

import br.edu.utfpr.database.ConnectDataBase;
import br.edu.utfpr.model.Aluno;

import java.sql.*;

import static java.sql.Statement.*;

public class AlunoRepository {

    public Aluno salvar(Aluno aluno) {
        Connection conn = ConnectDataBase.createConnections();
        try {
            PreparedStatement psSalvar = conn.prepareStatement(
                    "INSERT INTO aluno(nome, telefone, email, dataNascimento) " +
                            "VALUES(?, ?, ?, ?)", RETURN_GENERATED_KEYS
            );
            psSalvar.setString(1, aluno.getNome());
            psSalvar.setString(2, aluno.getTelefone());
            psSalvar.setString(3, aluno.getEmail());
            psSalvar.setDate(4, Date.valueOf(aluno.getDataNascimento()));

            int linhasAfetadas = psSalvar.executeUpdate();

            if(linhasAfetadas == 0){
                System.out.println(String.format("ERRO AO ADICIONAR ALUNO %s",
                        aluno.getNome().toUpperCase()));
            }else {
                ResultSet generatedKeys = psSalvar.getGeneratedKeys();
                if(generatedKeys.next()) {
                    aluno.setId(generatedKeys.getInt(1));
                    System.out.println(
                            String.format("ALUNO %s INSERIDO"
                                    , aluno.getNome().toUpperCase())
                    );
                }
            }
            psSalvar.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERRO AO CADASTRAR ALUNO");
        }
        System.out.println(String.format("Id do aluno inserido: %d", aluno.getId()));
        return aluno;
    }


}
