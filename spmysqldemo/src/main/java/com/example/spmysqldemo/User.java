package com.example.spmysqldemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Isto pede ao Hibernate para transformar esta classe numa tabela

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String name;
    private String email;
    
    // ID
    public Integer getId() {
        return id;
    } 
    public void setId(Integer id) {
        this.id = id;
    }

    // NOME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
