package com.Ias.PruebaTecnica.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Ias.PruebaTecnica.domain.model.Habitaciones;

public interface HabitacionRepository {

  Optional<Habitaciones> guardarHabitacion(Habitaciones habitacion);

  Optional<Habitaciones> obtenerHabitacionPorId(String id);

  List<Habitaciones> obtenerTodasLasHabitaciones();

  void actualizarHabitacion(Habitaciones habitacion);

  void eliminarHabitacion(Habitaciones id);

}
