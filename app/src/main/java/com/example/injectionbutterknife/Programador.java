package com.example.injectionbutterknife;

public class Programador {

    private int cont = 0;
    private String nombre;
//    public Programador(String nombre) {
//        this.nombre = nombre;
//    }

    public Programador() {
        cont++;
    }

    @Override
    public String toString() {
        return cont + "";
    }
}
