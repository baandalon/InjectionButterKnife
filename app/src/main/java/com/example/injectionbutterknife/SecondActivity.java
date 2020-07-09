package com.example.injectionbutterknife;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.injectionbutterknife.di.App;
import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity{

    @Inject
    Programador programador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((App) getApplication()).getComponentTest().inject(this);
        Toast.makeText(this, programador.toString(), Toast.LENGTH_SHORT).show();
    }

    public void btnClose(View view) {
        finish();
    }
}