package br.com.fiap.domain.repository;
import br.com.fiap.domain.entity.Instrutor;

import java.util.List;

public class InstrutorRepository implements Repository<Instrutor, Long> {
    List<Instrutor> instrutor;
    @Override
    public List<Instrutor> findAll() {
        return instrutor;
    }
    @Override
    public Instrutor findById(Long id) {
        return null;
    }
    @Override
    public List<Instrutor> findByName(String nome) {
        return null;
    }
    @Override
    public Instrutor persist(Instrutor curso) {
        return null;
    }
}
