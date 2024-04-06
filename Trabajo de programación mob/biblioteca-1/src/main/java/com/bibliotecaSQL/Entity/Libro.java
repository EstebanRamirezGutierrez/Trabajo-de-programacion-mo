package com.bibliotecaSQL.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column(name = "isbn", length = 25, nullable = false)
    private String ISBN;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "anio_publicacion", length = 50, nullable = false)
    private Integer anioPublicacion;

    @Column(name = "Sinopsis", length = 500, nullable = false)
    private String sinopsis;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autorId;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autorId;
    }

    public void setAutor(Autor autorId) {
        this.autorId = autorId;
    }
}
