package com.kaminski.willian.springapi.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Willian Kaminski
 * @since 28-09-19
 * @version 1.0
 */
@Entity
@Table(name = "paises", schema = "public")
public class Pais implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long i_paises;
    
    private String nome;

    public long getI_paises() {
        return i_paises;
    }

    public void setI_paises(long i_paises) {
        this.i_paises = i_paises;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
