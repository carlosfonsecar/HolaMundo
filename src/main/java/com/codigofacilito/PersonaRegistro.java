package com.codigofacilito;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("esta instruccion es inservible");
        return "%s %s".formatted(nombre,apellidos);
    }
}
