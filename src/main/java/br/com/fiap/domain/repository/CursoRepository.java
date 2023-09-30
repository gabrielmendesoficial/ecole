package br.com.fiap.domain.repository;
import br.com.fiap.domain.entity.Curso;

import java.util.List;

public class CursoRepository implements Repository<Curso, Long> {
    List<Curso> cursos;
    @Override
    public List<Curso> findAll() {
        return cursos;
    }
    @Override
    public Curso findById(Long id) {
        return null;
    }
    @Override
    public List<Curso> findByName(String nome) {
        return null;
    }
    @Override
    public Curso persist(Curso curso) {
        return curso;
    }
}
