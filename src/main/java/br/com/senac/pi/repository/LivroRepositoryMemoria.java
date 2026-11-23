package br.com.senac.pi.repository;

import br.com.senac.pi.model.Livro;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LivroRepositoryMemoria implements LivroRepository {
    private final Map<Long, Livro> livros = new LinkedHashMap<>();
    private long proximoId = 1;

    @Override
    public Livro salvar(Livro livro) {
        if (livro.getId() == null) livro.setId(proximoId++);
        livros.put(livro.getId(), livro);
        return livro;
    }

    @Override
    public List<Livro> listar() { return new ArrayList<>(livros.values()); }

    @Override
    public Optional<Livro> buscar(Long id) { return Optional.ofNullable(livros.get(id)); }

    @Override
    public boolean excluir(Long id) { return livros.remove(id) != null; }
}
