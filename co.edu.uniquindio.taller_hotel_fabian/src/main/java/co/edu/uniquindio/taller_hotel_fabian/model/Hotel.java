package co.edu.uniquindio.taller_hotel_fabian.model;


public class Hotel {
    public static void main(String[] args) {

        // Cliente 1
        Cliente cliente1 = new Cliente("Fabián Gallego", "1033710688");
        Habitacion habitacion1 = new Habitacion(101, "Doble", 800000.0);
        Reserva reserva1 = new Reserva(habitacion1, cliente1, "2025-03-10", "2025-03-15");

        // Cliente 2
        Cliente cliente2 = new Cliente("Marina Sánchez", "87654321B");
        Habitacion habitacion2 = new Habitacion(102, "Suite", 1200000.0);
        Reserva reserva2 = new Reserva(habitacion2, cliente2, "2025-03-12", "2025-03-18");

        // Agregar servicios a las habitaciones
        ServicioDeHabitacion servicioLimpieza = new ServicioDeHabitacion("Limpieza diaria");
        habitacion1.agregarServicio(servicioLimpieza);
        habitacion2.agregarServicio(servicioLimpieza);

        ServicioDeHabitacion servicioRestaurante = new ServicioDeHabitacion("Menú diario del restaurante");
        habitacion1.agregarServicio(servicioRestaurante);
        habitacion2.agregarServicio(servicioRestaurante);

        // Mostrar información de reservas y servicios
        cliente1.mostrarReservas();
        habitacion1.mostrarServicios();

        cliente2.mostrarReservas();
        habitacion2.mostrarServicios();

        // Calcular costos de reserva
        ReservaManager reservaManager = new ReservaManager();
        reservaManager.mostrarCostoReserva(reserva1);
        reservaManager.mostrarCostoReserva(reserva2);
    }
}

