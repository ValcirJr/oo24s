package br.edu.utfpr;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.model.Model;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Model> models = List.of(new Aluno());
        models.forEach(Model::createTable);
    }
}
