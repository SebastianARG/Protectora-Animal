/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprotectora;

import java.util.Scanner;
import com.mycompany.conexion.Conexio;
import com.mycompany.controlador.AnimalController;
import com.mycompany.modelo.Animal;

/**
 *
 * @author Sebastian
 */
public class GestioProtectora {

    private Conexio conexio;
    private AnimalController ac;

    public GestioProtectora() {
        this.conexio = new Conexio();
        ac = new AnimalController(conexio);
    }

    public void menu() {

        Scanner sc = new Scanner(System.in);
        int opcio = 0;
        boolean continuar = true;

        do {
            System.out.println("Tria una opció:");
            System.out.println("1. Afegir animal.");
            System.out.println("2. Modificar animal.");
            System.out.println("3. Eliminar animal.");
            System.out.println("4. Mostrar animals.");
            System.out.println("5. Mostrar animals per id.");
            System.out.println("5. Mostrar total d'animals.");
            System.out.println("99. Sortir.");
            System.out.print("> ");

            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    ac.insertarAnimal();
                    break;

                case 2:
                    ac.modificarAnimal();
                    break;

                case 3:
                    ac.eliminarAnimal();
                    break;

                case 4:
                    ac.consultarAnimals();
                    break;

                case 5:
                    ac.consultarAnimalPerId();
                    break;

                case 6:
                    ac.consultarTotalDAnimals();
                    break;

                case 99:
                    System.out.println("Adeu!!!");
                    continuar = false;
                    conexio.desconcectar();
                    break;

                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }

        } while (continuar);
    }
}
