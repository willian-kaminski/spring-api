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
 * @since 29-09-19
 * @version 1.0
 */
@Entity
@Table(name = "cidades", schema = "public")
public class Cidade implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long i_cidades;
    
    private long i_estados;
    
    private String nome;

    public long getI_cidades() {
        return i_cidades;
    }

    public void setI_cidades(long i_cidades) {
        this.i_cidades = i_cidades;
    }

    public long getI_estados() {
        return i_estados;
    }

    public void setI_estados(long i_estados) {
        this.i_estados = i_estados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}