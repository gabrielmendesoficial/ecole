package br.com.fiap.domain.repository;
import br.com.fiap.domain.entity.Turma;

import java.util.List;

public class TurmaRepository implements Repository<Turma, Long> {
    List<Turma> turma;
    @Override
    public List<Turma> findAll() {
        return turma;
    }
    @Override
    public Turma findById(Long id) {
        return null;
    }
    @Override
    public List<Turma> findByName(String nome) {
        return null;
    }
    @Override
    public Turma persist(Turma curso) {
        return null;
    }
}
