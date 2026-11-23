package br.com.senac.pi.service;

import br.com.senac.pi.model.Livro;
import java.math.BigDecimal;

public class EstoqueService {
    public BigDecimal calcularTotal(Livro livro) {
        validar(livro);
        return livro.getPreco().multiply(BigDecimal.valueOf(livro.getQuantidade()));
    }

    public void validar(Livro livro) {
        if (livro == null || livro.getTitulo() == null || livro.getTitulo().isBlank()
                || livro.getAutor() == null || livro.getAutor().isBlank()) {
            throw new IllegalArgumentException("Título e autor são obrigatórios.");
        }
        if (livro.getPreco() == null || livro.getPreco().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        if (livro.getQuantidade() < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }
}
