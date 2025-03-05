package co.edu.uniquindio.taller_hotel_fabian.services;

// Principio de segregación de Interfaces: Las interfaces deben ser pequeñas
// y específicas. Si una interfaz tiene muchos
// métodos que no son útiles para todas las clases que la implementan, esas clases
// se verán forzadas a definir métodos innecesarios, lo que genera código poco mantenible
// y más propenso a errores.

public interface Consumible {
    void consumir();
}

