package com.example.injectionbutterknife.di;

import com.example.injectionbutterknife.Programador;

import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ModuleTest {
    /*Se encarga de proveer a nuestra actividad todas
    las instancias necesarias para que funcione nuestras
    clases
     */
    @Singleton
    @Provides
    public Programador providesProgramadorOnly(){
        return new Programador();
    }

    @Provides
    public Empresa providesEmpresa(Programador programador){
        return new Empresa(programador);
    }
}
