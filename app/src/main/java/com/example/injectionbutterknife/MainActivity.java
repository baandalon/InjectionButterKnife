package com.example.injectionbutterknife;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.injectionbutterknife.di.App;
import com.example.injectionbutterknife.di.Empresa;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{

    @Inject
    Programador programador;

    @Inject
    Empresa empresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getComponentTest().inject(this);
        Toast.makeText(this, programador.toString(), Toast.LENGTH_SHORT).show();
    }

    public void btn1(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void btn2(View view) {
        Toast.makeText(this, empresa.toString(), Toast.LENGTH_SHORT).show();
    }
}