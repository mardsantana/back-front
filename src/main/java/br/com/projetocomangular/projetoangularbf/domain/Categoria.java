package br.com.projetocomangular.projetoangularbf.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Categoria {

    private UUID idCat;
    private String nome;
    private String descricao;

    private List<Livro> livros = new ArrayList<>();

    public Categoria(){
        super();
    }

    public Categoria(UUID idCat, String nome, String descricao) {
        this.idCat = idCat;
        this.nome = nome;
        this.descricao = descricao;
    }

    public UUID getIdCat() {
        return idCat;
    }

    public void setIdCat(UUID idCat) {
        this.idCat = idCat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return idCat.equals(categoria.idCat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idCat);
    }
}
