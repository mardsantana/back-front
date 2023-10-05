package br.com.projetocomangular.projetoangularbf.domain;

import java.util.Objects;
import java.util.UUID;

public class Livro {

    private UUID idLiv;
    private String titulo;
    private String nome_autor;
    private String texto;

    private Categoria categoria;

    public Livro(){
        super();
    }
    public Livro(UUID idLiv, String titulo, String nome_autor, String texto, Categoria categoria) {
        this.idLiv = idLiv;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
    }

    public UUID getIdLiv() {
        return idLiv;
    }

    public void setIdLiv(UUID idLiv) {
        this.idLiv = idLiv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return idLiv.equals(livro.idLiv);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idLiv);
    }
}
