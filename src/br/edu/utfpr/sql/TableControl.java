package br.edu.utfpr.sql;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.model.Avaliacao;
import br.edu.utfpr.model.Disciplina;
import br.edu.utfpr.model.Model;

import java.util.List;

public class TableControl {
    public static final List<Model> NEW_TABLES_V1 =
            List.of(
                    new Aluno(),
                    new Disciplina(),
                    new Avaliacao()
            );

    public static void createTablesV1(){
        System.out.println("INICIANDO CRIAÇÃO DE TABELAS");
        NEW_TABLES_V1.forEach(Model::createTable);
        System.out.println("FIM DA CRIAÇÃO DE TABELAS");
    }
}
