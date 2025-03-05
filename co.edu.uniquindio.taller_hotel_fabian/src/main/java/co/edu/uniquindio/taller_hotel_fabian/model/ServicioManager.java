package co.edu.uniquindio.taller_hotel_fabian.model;

import java.util.ArrayList;
import java.util.List;


// Principio de Responsabilidad Única: Separación de la gestión de servicios

public class ServicioManager {
    private List<Servicio> servicios = new ArrayList<>();

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void mostrarServicios(int numeroHabitacion) {
        System.out.println("Servicios para la habitación " + numeroHabitacion + ":");
        for (Servicio s : servicios) {
            s.consumir();
        }
    }
}