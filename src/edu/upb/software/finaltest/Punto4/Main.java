package edu.upb.software.finaltest.Punto4;

public class Main {
    public static void main(String[] args) {
        Eventos evento;
        evento = new Eventos(1,"Luis Miguel","Movistar Arena",900,2022);
        System.out.println(evento);

        System.out.println(evento.revisarEvento(evento));
    }

}
