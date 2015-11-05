package com.example.ricardo.historiainteractiva.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ricardo.historiainteractiva.R;


public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= (EditText)findViewById(R.id.nombre);
        boton = (Button)findViewById(R.id.boton1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario= nombre.getText().toString();
                comenzarActividad(nombreUsuario);
            }
        });
    }

    private void comenzarActividad(String nombreUsuario){
    Intent intent = new Intent(this, HistoriaActivity.class);
    intent.putExtra(getString(R.string.key_name),nombreUsuario);
    startActivity(intent);

    }
}
