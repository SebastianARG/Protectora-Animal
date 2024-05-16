/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vista;

import com.mycompany.modelo.Animal;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class AnimalVista {
    public Animal pedirDatos(){
        //Instanciamos las clases creadas
        Animal animal = new Animal();
        Scanner sc = new Scanner(System.in);
        //Pedimos datos
        System.out.println("Dime el nombre del animal: ");
        animal.setNom(sc.nextLine());
        System.out.println("Dime la especie del animal: ");
        animal.setEspecie(sc.nextLine());
        System.out.println("Dime la edad del animal: ");
        animal.setEdad(sc.nextInt());
        //Devolvemos el animal
        return animal;
    }
}
