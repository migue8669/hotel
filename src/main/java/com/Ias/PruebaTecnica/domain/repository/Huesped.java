package com.Ias.PruebaTecnica.domain.repository;

public interface Huesped {
    Optional<Huesped> guardarHuesped(Huesped huesped);
    Optional<Huesped>  obtenerHuespedPorId(String id);
    List<Huesped> obtenerTodasLosHuespedes();
    void actualizarHabitacion(Huesped huesped);
    void eliminarHabitacion(Huesped id);
}
