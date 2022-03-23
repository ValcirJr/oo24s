package br.edu.utfpr.model;

import br.edu.utfpr.sql.CreateTableHelper;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Avaliacao extends Model{

    private Disciplina disciplina;
    private Aluno aluno;
    private Double nota;

    @Override
    public CreateTableHelper generateCreateTableSQL() {
        String createTable = "" +
                "CREATE TABLE IF NOT EXISTS avaliacao (" +
                    "id SERIAL PRIMARY KEY, " +
                    "id_disciplina INT NOT NULL, " +
                    "id_aluno INT NOT NULL);";

        String dropTable = "" +
                "DROP TABLE IF EXISTS avaliacao";

        return new CreateTableHelper(createTable, dropTable);
    }
}
