package com.example.SpringDataREST.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;

    public Client() {}


    public Client(String nom, String email, List<Compte> comptes) {
        this.nom = nom;
        this.email = email;
        this.comptes = comptes;
    }

    public Client(Long id, String nom, String email, List<Compte> comptes) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.comptes = comptes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}