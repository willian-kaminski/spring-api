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
@Table(name = "pessoas", schema = "public")
public class Pessoa implements Serializable{
    
    private static final long serialVersionUID =  1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long i_pessoas;
    
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private String ddd;
    private String telefone;

    public long getI_pessoas() {
        return i_pessoas;
    }

    public void setI_pessoas(long i_pessoas) {
        this.i_pessoas = i_pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
