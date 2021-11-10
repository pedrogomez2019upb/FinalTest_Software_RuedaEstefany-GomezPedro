package edu.upb.software.finaltest.Punto4;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventosTest {

    Eventos e = new Eventos(1,"Luis Miguel","Movistar Arena",900,2022);


    @Test
    void revisarEvento() {
        assertEquals("Eventos{id=1, nombre='Luis Miguel', direccion='Movistar Arena', hora=900, fecha=2022}",
                e.revisarEvento(e));
    }
}