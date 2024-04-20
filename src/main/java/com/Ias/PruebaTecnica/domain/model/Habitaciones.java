package com.Ias.PruebaTecnica.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Habitaciones {
    private String id;
    private String cantidadHuespedes;
    private String tipo;
    private String checkIn;
    private String checkOut;
    private String valor;

}
