package br.com.senac.pi.model;

import java.math.BigDecimal;

public class Livro {
    private Long id;
    private String titulo;
    private String autor;
    private BigDecimal preco;
    private int quantidade;

    public Livro(Long id, String titulo, String autor, BigDecimal preco, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public BigDecimal getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
