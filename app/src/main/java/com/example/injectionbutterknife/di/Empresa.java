package com.example.injectionbutterknife.di;

import com.example.injectionbutterknife.Programador;

public class Empresa {
    private Programador programador;

    public Empresa(Programador programador) {
        this.programador = programador;
    }

    @Override
    public String toString() {
        return programador.toString();
    }
}
