package co.edu.uniquindio.taller_hotel_fabian.model;
import co.edu.uniquindio.taller_hotel_fabian.services.Consumible;


abstract class Servicio implements Consumible {
    protected String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public abstract void consumir();
}