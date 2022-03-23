package br.edu.utfpr.service;

import br.edu.utfpr.model.Aluno;

public interface AlunoCRUDService {

    Aluno salvarAluno(Aluno aluno);

    int removerAluno(Aluno aluno);

    int removerAluno(int idAluno);
    

}
