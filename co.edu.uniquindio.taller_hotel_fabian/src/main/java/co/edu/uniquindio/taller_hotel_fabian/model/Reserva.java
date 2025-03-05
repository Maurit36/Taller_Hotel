package co.edu.uniquindio.taller_hotel_fabian.model;
import co.edu.uniquindio.taller_hotel_fabian.services.ReservaInterface;


public class Reserva implements ReservaInterface {
    private Habitacion habitacion;
    private Cliente cliente;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, String fechaEntrada, String fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        cliente.agregarReserva(this);
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    // Calcular el costo total de la reserva
    public double calcularCosto() {
        long dias = Math.abs(java.time.LocalDate.parse(fechaSalida).toEpochDay()
                - java.time.LocalDate.parse(fechaEntrada).toEpochDay());
        return dias * habitacion.getPrecio();
    }
}
