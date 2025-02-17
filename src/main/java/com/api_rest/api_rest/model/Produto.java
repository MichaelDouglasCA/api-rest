package com.api_rest.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    private Long id;
    private String nome;
    private double preco;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
