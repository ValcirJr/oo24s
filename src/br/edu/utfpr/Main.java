package br.edu.utfpr;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.service.AlunoCRUDService;
import br.edu.utfpr.service.impl.AlunoCRUDServiceImpl;
import br.edu.utfpr.sql.TableControl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AlunoCRUDService service = new AlunoCRUDServiceImpl();

        TableControl.createTablesV1();

        Aluno a1 = Aluno.builder()
                .nome("Valicr Balbinotti Junior")
                .email("balbinottijr@gmail.com")
                .dataNascimento(LocalDate.parse("1994-11-09"))
                .telefone("+55 46 99999-9999")
                .build();

        service.salvarAluno(a1);
    }
}
