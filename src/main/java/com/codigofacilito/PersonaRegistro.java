package com.codigofacilito;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Se comento la liena que sobra CF
        //System.out.println("esta instruccion es inservible");
        return "%s %s".formatted(nombre,apellidos);
    }
}
