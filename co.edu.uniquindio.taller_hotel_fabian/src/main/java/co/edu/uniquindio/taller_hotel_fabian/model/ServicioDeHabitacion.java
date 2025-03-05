package co.edu.uniquindio.taller_hotel_fabian.model;


class ServicioDeHabitacion extends Servicio {
    public ServicioDeHabitacion(String nombre) {
        super(nombre);
    }

    @Override
    public void consumir() {
        System.out.println("El servicio para esta habitación es: " + nombre);
    }
}
