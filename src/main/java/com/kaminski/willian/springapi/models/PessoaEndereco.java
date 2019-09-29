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
@Table(name = "pessoas_enderecos", schema = "public")
public class PessoaEndereco implements Serializable{
    
    private static final long serialVersionUID =  1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long i_pessoas_enderecos;
    
    private long i_pessoas;
    private long i_cidades;
    private String logradouro;
    private Integer numero;

    public long getI_pessoas_enderecos() {
        return i_pessoas_enderecos;
    }

    public void setI_pessoas_enderecos(long i_pessoas_enderecos) {
        this.i_pessoas_enderecos = i_pessoas_enderecos;
    }

    public long getI_pessoas() {
        return i_pessoas;
    }

    public void setI_pessoas(long i_pessoas) {
        this.i_pessoas = i_pessoas;
    }

    public long getI_cidades() {
        return i_cidades;
    }

    public void setI_cidades(long i_cidades) {
        this.i_cidades = i_cidades;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
