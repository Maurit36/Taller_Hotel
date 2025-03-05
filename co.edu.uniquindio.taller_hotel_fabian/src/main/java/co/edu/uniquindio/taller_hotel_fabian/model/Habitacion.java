package co.edu.uniquindio.taller_hotel_fabian.model;


public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private ServicioManager servicioManager;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.servicioManager = new ServicioManager();
    }

    public void agregarServicio(Servicio servicio) {
        servicioManager.agregarServicio(servicio);
    }

    public void mostrarServicios() {
        servicioManager.mostrarServicios(numero);
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }
}
