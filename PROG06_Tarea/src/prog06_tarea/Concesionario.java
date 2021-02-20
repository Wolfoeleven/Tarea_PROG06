/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog06_tarea;


/**
 *
 * @author Iván Morán Díaz
 */
public class Concesionario {

    //Declaramos y creamos un array para los vehículos del listaVehiculos
    static Vehiculo[] listaVehiculos = new Vehiculo[50];
    //Añadimos un contador
    int numeroVehiculos;

    /**
     * Constructor
     */
    public Concesionario() {

        numeroVehiculos = 0;

    }

    public boolean addVehiculo(Vehiculo c) {

        //Buscamos coiincidencia con la matricula
        boolean encontrado = false;

        for (int i = 0; i < numeroVehiculos; i++) {
            //Si coincide la matricula
            if (listaVehiculos[i].getMatricula().equals(c.getMatricula())) {
                //La matricula existe
                encontrado = true;
            }
        }
        //Si la matricula no existe
        if (encontrado == false) {
            //Para añadir en la primera posición no ocupada
            listaVehiculos[numeroVehiculos] = c;

            //Incrementamos el contador de vehículos añadidos
            numeroVehiculos++;
            return true;
                      
        }else{
            return false;
        }
    }
}
