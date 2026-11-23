package br.com.senac.pi;

import br.com.senac.pi.model.Livro;
import br.com.senac.pi.repository.LivroRepository;
import br.com.senac.pi.repository.LivroRepositoryMemoria;
import br.com.senac.pi.service.EstoqueService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        LivroRepository repositorio = new LivroRepositoryMemoria();
        EstoqueService estoque = new EstoqueService();
        Livro livro = new Livro(null, "Dom Casmurro", "Machado de Assis", new BigDecimal("29.90"), 3);
        estoque.validar(livro);
        repositorio.salvar(livro);
        System.out.println("Livro cadastrado: " + repositorio.buscar(livro.getId()).orElseThrow().getTitulo());
        System.out.println("Total em estoque: R$ " + estoque.calcularTotal(livro));
        if (repositorio.listar().size() != 1 || estoque.calcularTotal(livro).compareTo(new BigDecimal("89.70")) != 0) {
            throw new AssertionError("Falha na verificação inicial.");
        }
        System.out.println("Verificações básicas: OK");
    }
}
