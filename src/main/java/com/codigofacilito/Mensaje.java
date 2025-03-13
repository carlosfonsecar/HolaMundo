package com.codigofacilito;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.printf(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String escribeTuMensaje) {
        System.out.printf("Hola %s a java\n", escribeTuMensaje);
    }
}
