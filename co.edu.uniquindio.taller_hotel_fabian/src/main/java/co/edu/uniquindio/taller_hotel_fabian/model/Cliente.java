package co.edu.uniquindio.taller_hotel_fabian.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    List<Reserva> reservas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void mostrarReservas() {
        System.out.println("Reservas de " + nombre + ":");
        for (Reserva r : reservas) {
            System.out.println("Habitación " + r.getHabitacion().getNumero() +
                    ", Desde " + r.getFechaEntrada() + " hasta " + r.getFechaSalida());
        }
    }

    public String getNombre() {
        return nombre;
    }
}

