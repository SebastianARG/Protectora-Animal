/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import java.sql.Connection;

/**
 *
 * @author Sebastian
 */
public class Animal {
    private int id;
    private String nom;
    private String especie;
    private int edad;

    public Animal(int id, String nom, String especie, int edad) {
        this.id = id;
        this.nom = nom;
        this.especie = especie;
        this.edad = edad;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nom=" + nom + ", especie=" + especie + ", edad=" + edad + '}';
    }
}
