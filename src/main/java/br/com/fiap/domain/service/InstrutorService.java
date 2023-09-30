package br.com.fiap.domain.service;
import br.com.fiap.domain.entity.Instrutor;
import br.com.fiap.domain.repository.InstrutorRepository;


import java.util.List;
import java.util.Objects;

public class InstrutorService implements Service<Instrutor, Long> {
    private InstrutorRepository repository;
    public InstrutorService(InstrutorRepository instrutorRepository) {
        this.repository = new InstrutorRepository();
    }
    @Override
    public List<Instrutor> findAll() {
        return repository.findAll();
    }
    @Override
    public Instrutor findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Instrutor> findByName(String texto) {
        return repository.findByName(texto);
    }
    @Override
    public Instrutor persist(Instrutor instrutor) {
        if (Objects.nonNull(instrutor)){
            return repository.persist(instrutor);
        }
        return null;
    }
}
