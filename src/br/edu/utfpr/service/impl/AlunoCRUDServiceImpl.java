package br.edu.utfpr.service.impl;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.repository.AlunoRepository;
import br.edu.utfpr.service.AlunoCRUDService;

public class AlunoCRUDServiceImpl implements AlunoCRUDService {

    AlunoRepository repository = new AlunoRepository();

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        System.out.println("Iniciou salvarAluno() " + aluno.toString());
        repository.salvar(aluno);
        System.out.println("Finalizou" + aluno.toString());
        return aluno;
    }

    @Override
    public int removerAluno(Aluno aluno) {
        return 0;
    }

    @Override
    public int removerAluno(int idAluno) {
        return 0;
    }
}
