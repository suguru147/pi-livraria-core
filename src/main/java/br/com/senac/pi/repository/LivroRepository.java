package br.com.senac.pi.repository;

import br.com.senac.pi.model.Livro;
import java.util.List;
import java.util.Optional;

public interface LivroRepository {
    Livro salvar(Livro livro);
    List<Livro> listar();
    Optional<Livro> buscar(Long id);
    boolean excluir(Long id);
}
