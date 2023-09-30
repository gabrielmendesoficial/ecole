package br.com.fiap.domain.repository;
import br.com.fiap.domain.entity.Aluno;

import java.util.List;

public class AlunoRepository implements Repository<Aluno, Long> {
    List<Aluno> alunos;
    @Override
    public List<Aluno> findAll() {
        return alunos;
    }
    @Override
    public Aluno findById(Long id) {
        return null;
    }
    @Override
    public List<Aluno> findByName(String nome) {
        return null;
    }
    @Override
    public Aluno persist(Aluno curso) {
        return null;
    }
}
