package com.Ias.PruebaTecnica.infraestructure;

import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionDBRepository<Habitacion> extends JpaRepository<Habitacion, Long> {
}
