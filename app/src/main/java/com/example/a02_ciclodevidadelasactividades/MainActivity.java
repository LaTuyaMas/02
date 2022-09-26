package com.example.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variables de vista
    private Button btnAbrirHija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("CICLO VIDA", "Estoy ejecutando OnCreate - ACTIVIDAD 1");

        btnAbrirHija = findViewById(R.id.btnAbrirAct2Main);

        btnAbrirHija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * Intent ==> Conductor para creación y apertura de actividades
                 *
                 *  - Implicitos: Ya programados -> Cámara, Galería, Operaciones estándar del móvil.
                 *  - Explicitos: Programados para abrir nuestras actividades
                 *     - Context: Actividad en la que estoy (Retorno)
                 *     - Destino: La actividad que quiero abrir
                 */
                Intent intent = new Intent(MainActivity.this, HijoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("CICLO VIDA", "Estoy ejecutando onStart - ACTIVIDAD 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("CICLO VIDA", "Estoy ejecutando onRestart - ACTIVIDAD 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CICLO VIDA", "Estoy ejecutando onStop - ACTIVIDAD 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CICLO VIDA", "Estoy ejecutando onDestroy - ACTIVIDAD 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CICLO VIDA", "Estoy ejecutando onPause - ACTIVIDAD 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CICLO VIDA", "Estoy ejecutando onResume - ACTIVIDAD 1");
    }
}