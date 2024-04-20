package com.Ias.PruebaTecnica.infraestructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ias.PruebaTecnica.application.HabitacionesUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/habitaciones")
@RequiredArgsConstructor
public class HabitacionesController {
    private final HabitacionesUseCase habitacionesUseCase;

    @GetMapping("/{id}/post")
    public ResponseEntity obtenerReserva(@PathVariable String id) {
        return ResponseEntity.ok(this.habitacionesUseCase.obtenerHabitacionPorId(id));
    }
}
