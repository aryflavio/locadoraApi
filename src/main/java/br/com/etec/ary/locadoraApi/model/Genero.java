package br.com.etec.ary.locadoraApi.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "genero")
public class Genero {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idgenero")
    private Genero genero;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return id.equals(genero.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

