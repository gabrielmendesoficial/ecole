package br.com.fiap.domain.service;
import br.com.fiap.domain.entity.Turma;
import br.com.fiap.domain.repository.TurmaRepository;
import java.util.List;
import java.util.Objects;

public class TurmaService implements Service<Turma, Long> {
    private TurmaRepository repository;
    public TurmaService(TurmaRepository turmaRepository) {
        this.repository = new TurmaRepository();
    }
    @Override
    public List<Turma> findAll() {
        return repository.findAll();
    }
    @Override
    public Turma findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Turma> findByName(String texto) {
        return repository.findByName(texto);
    }
    @Override
    public Turma persist(Turma turma) {
        if (Objects.nonNull(turma)){
            return repository.persist(turma);
        }
        return null;
    }
}
