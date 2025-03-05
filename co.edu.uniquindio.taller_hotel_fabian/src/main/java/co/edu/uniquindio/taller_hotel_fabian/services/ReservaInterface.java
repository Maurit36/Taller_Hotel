package co.edu.uniquindio.taller_hotel_fabian.services;

import co.edu.uniquindio.taller_hotel_fabian.model.Habitacion;

// Principio de Inversión de Dependencias: La reserva ahora depende de una interfaz

public interface ReservaInterface {
    Habitacion getHabitacion();
    String getFechaEntrada();
    String getFechaSalida();
}
