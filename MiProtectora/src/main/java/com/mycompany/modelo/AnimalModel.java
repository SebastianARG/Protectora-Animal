/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import com.mycompany.conexion.Conexio;

/**
 *
 * @author Sebastian
 */
public class AnimalModel {
    private Conexio con;
    public AnimalModel(Conexio con) {
        this.con = con;
    }

    public void insertarAnimal(Animal animal) {
        String sql = "Insert into animales (nom,especie,edad) values ("+animal.getNom()+", "+animal.getEspecie()+", "+animal.getEdad()+");";
        con.ejecutarUpdate(sql);
    }
    
}
