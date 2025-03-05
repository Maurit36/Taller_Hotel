package co.edu.uniquindio.taller_hotel_fabian.model;



public class ReservaManager {
    public void mostrarCostoReserva(Reserva reserva) {
        System.out.println("El costo total de la reserva para la habitación " +
                reserva.getHabitacion().getNumero() + " es: " + reserva.calcularCosto());
    }
}
