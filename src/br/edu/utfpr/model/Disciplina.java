package br.edu.utfpr.model;

import br.edu.utfpr.sql.CreateTableHelper;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Disciplina extends Model{

    private String nome;

    @Override
    public CreateTableHelper generateCreateTableSQL() {
        String createTable = "" +
                "CREATE TABLE IF NOT EXISTS disciplina (" +
                    "id SERIAL PRIMARY KEY, " +
                    "nome VARCHAR(50) NOT NULL " +
                    ");";


        String dropTable = "" +
                "DROP TABLE IF EXISTS disciplina";

        return new CreateTableHelper(createTable, dropTable);
    }
}
