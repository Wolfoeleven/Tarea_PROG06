/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog06_tarea;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import static prog06_tarea.Concesionario.listaVehiculos;

/**
 * @author Iván Morán Díaz La clase Principal albergará el método Main, que
 * inicializará todo el proceso de construcción de vehículos, consultas y cierre
 * del programa
 * @see Vehículo
 */
public class Principal {

    /**
     * Declaramos los métodos de la clase Método principal de la clase Se trata
     * del menú desde el que el usuario elegirá las opciones y realizará la
     * introducción de datos
     *
     * @param args
     */
    public static void main(String[] args) {

        Vehiculo coche = null;
        Scanner sn = new Scanner(System.in);
        boolean salir = Boolean.FALSE;
        int opcion; // Guardaremos la opción del usuario

        while (!salir) {

            Utils.getMenu(); // Mostraremos el menú

            try {

                System.out.println("Por favor, seleccione una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Proporcione los siguientes datos:");
                        Scanner sc = new Scanner(System.in);
                        for (int i = 0; i < Concesionario.listaVehiculos.length; i++) {
                            System.out.println("Número de matrícula:");
                            String matricula;
                            do {
                                matricula = sc.next();
                                sc.nextLine();
                            } while (!Utils.validarMatricula(matricula));
                            System.out.println("Marca:");
                            String marca = sc.next();

                            System.out.println("Número de kilómetros (debe ser mayor que 0):");
                            int numKilometros;
                            do {
                                numKilometros = sc.nextInt();
                                sc.nextLine();
                            } while (!Utils.validarKilometraje(numKilometros));

                            System.out.println("Fecha de matriculación(debe ser menor que hoy):");

                            int dia;
                            int mes;
                            int anio;
                            Calendar calendar = Calendar.getInstance();
                            do {
                                System.out.println("Introduzca el día: ");
                                dia = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Introduzca el mes: ");
                                mes = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Introduzca el año: ");
                                anio = sc.nextInt();
                                sc.nextLine();
                            } while (!Utils.validarFechaMatriculacion(dia, mes, anio));
                            String fechaMat = dia + "/" + mes + "/" + anio;

                            System.out.println("Descripción del vehículo:");
                            String descripcion = sc.next();

                            System.out.println("Precio:");
                            double precio = sc.nextDouble();

                            System.out.println("Nombre del propietario:");
                            String nomPropietario = sc.next();

                            System.out.println("Número de DNI:");
                            String dni = sc.next();
                            try {
                                Utils.validarDNI(dni);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                break;
                            }

                            Vehiculo nuevoVehiculo = new Vehiculo(marca, matricula, numKilometros, fechaMat, descripcion, precio, nomPropietario, dni);
                            Concesionario.listaVehiculos[i] = nuevoVehiculo;
                            break;
                        }
                        break;

                    case 2:
                        for (int i = 0; i < Concesionario.listaVehiculos.length; i++) {
                            System.out.println(Concesionario.listaVehiculos[i]);
                        }
                        break;
                    case 3:
                        System.out.println("Por favor, introduzca matrícula: ");
                        String buscarMatricula = sn.next();
                        

                        break;
                    case 4:
                        if (coche != null) {
                            System.out.println("Introduzca el número número de kilómetros del vehículo: ");
                            coche.setNumKilometros(sn.nextInt());
                        } else {
                            System.out.println("Error: no se puede actualizar el número de kilómetros.");
                            System.out.println("Motivo: no existe vehículo.");
                        }
                        break;
                    case 5:
                        salir = Boolean.TRUE;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");

                }
            } catch (InputMismatchException e) {
                System.out.println("Debe insertar un número");
                sn.next();
            }
        }
    }
}
