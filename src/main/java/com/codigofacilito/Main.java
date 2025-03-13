package com.codigofacilito;

public class Main {
    public static void main(String[] args) {

        Mensaje msg = new Mensaje();
        String escribeTuMensaje = msg.solicitaDatos("Escribe tu mensaje: ");
        msg.saludar(escribeTuMensaje);

    }
}