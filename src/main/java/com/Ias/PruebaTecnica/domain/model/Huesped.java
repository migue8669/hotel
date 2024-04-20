package com.Ias.PruebaTecnica.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Huesped {
    private String id;
    private String nombre;
    private String Habitacion;
    private String fechaIngreso;
    private String fechaSalida;

}
