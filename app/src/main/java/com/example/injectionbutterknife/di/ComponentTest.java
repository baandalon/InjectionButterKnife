package com.example.injectionbutterknife.di;

import com.example.injectionbutterknife.MainActivity;
import com.example.injectionbutterknife.SecondActivity;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Singleton
@Component(modules = ModuleTest.class)
public interface ComponentTest {
    //Cual es el activity que recibirá las injecciones
//    void inject(App app);
    void inject(MainActivity mainActivity);
    void inject(SecondActivity secondActivity);
}
