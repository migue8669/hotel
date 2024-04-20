package com.Ias.PruebaTecnica.infraestructure;

import java.util.List;
import java.util.Optional;

import com.Ias.PruebaTecnica.domain.model.Habitaciones;
import com.Ias.PruebaTecnica.domain.repository.HabitacionRepository;

public class PostHabitacionesImpl implements HabitacionRepository {

    @Override
    public void actualizarHabitacion(Habitaciones habitacion) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarHabitacion(Habitaciones id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Optional<Habitaciones> guardarHabitacion(Habitaciones habitacion) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Habitaciones> obtenerHabitacionPorId(String id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<Habitaciones> obtenerTodasLasHabitaciones() {
        // TODO Auto-generated method stub
        return null;
    }

}
