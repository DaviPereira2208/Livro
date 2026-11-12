package com.dest1.livros.entities;

@Entity
public class Livro {

    @Id
    private int id;
    private String genero;
    private String autor;
    private int numeroPaginas;
    private String idioma;
    private int anoPublicacao;

    public Livro(String genero, String autor, int numeroPaginas, String idioma, int anoPublicacao) {
        this.genero = genero;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(){}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
