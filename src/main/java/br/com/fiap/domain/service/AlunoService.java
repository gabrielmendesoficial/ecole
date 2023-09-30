package br.com.fiap.domain.service;
import br.com.fiap.domain.entity.Aluno;
import br.com.fiap.domain.repository.AlunoRepository;
import java.util.List;
import java.util.Objects;

public class AlunoService implements Service<Aluno, Long> {
    private AlunoRepository repository;
    public AlunoService(AlunoRepository alunoRepository) {
        this.repository = new AlunoRepository();
    }
    @Override
    public List<Aluno> findAll() {
        return repository.findAll();
    }
    @Override
    public Aluno findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Aluno> findByName(String texto) {
        return repository.findByName(texto);
    }
    @Override
    public Aluno persist(Aluno aluno) {
        if (Objects.nonNull(aluno)){
            return repository.persist(aluno);
        }
        return null;
    }
}
