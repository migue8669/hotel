package com.Ias.PruebaTecnica.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Ias.PruebaTecnica.domain.model.Habitaciones;
import com.Ias.PruebaTecnica.domain.repository.HabitacionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HabitacionesUseCase {
    private final HabitacionRepository habitacionRepository;

    public List<Habitaciones> obtenerTodasLasHabitaciones() {
        return this.habitacionRepository.obtenerTodasLasHabitaciones();
    }

    public Habitaciones obtenerHabitacionPorId(String id){
        return this.habitacionRepository.obtenerHabitacionPorId(id).orElseThrow()
    }

    public List<Habitaciones> obtenerTodasLasHabitacionesPorHuespedId() {
        return this.habitacionRepository.obtenerTodasLasHabitaciones();
    }

}
