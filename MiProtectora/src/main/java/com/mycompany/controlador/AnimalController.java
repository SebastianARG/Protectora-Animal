package com.mycompany.controlador;
import com.mycompany.conexion.Conexio;
import com.mycompany.modelo.Animal;
import com.mycompany.modelo.AnimalModel;
import com.mycompany.vista.AnimalVista;

/**
 *
 * @author Sebastian
 */
public class AnimalController {
    private Conexio con;
    Animal animal;
    private AnimalVista animalVista;
    private AnimalModel animalModel;

    public AnimalController(Conexio con) {
        this.con = con;
        animal = new Animal();
        this.animalVista = new AnimalVista();
        this.animalModel = new AnimalModel(con);
    }


    public void insertarAnimal() {
        animal = animalVista.pedirDatos();
    }

    public void modificarAnimal() {

    }

    public void eliminarAnimal() {

    }

    public void consultarAnimals() {

    }

    public void consultarAnimalPerId() {

    }

    public void consultarTotalDAnimals() {

    }
}
