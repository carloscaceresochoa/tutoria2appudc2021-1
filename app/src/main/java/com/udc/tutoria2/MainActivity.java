package com.udc.tutoria2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.udc.tutoria2.modelo.entidad.Persona;

public class MainActivity extends AppCompatActivity {
    private EditText stexto;
    private EditText etexto;
    private EditText dtexto;
    private TextView saltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stexto=findViewById(R.id.stexto);
        etexto=findViewById(R.id.etexto);
        dtexto=findViewById(R.id.dtexto);
        saltext=findViewById(R.id.saltext);

    }

    public void capturar(View view){
                capturarObjetos();
    }

    public void capturarVariables(){
        String nombre=stexto.getText().toString();
        String edad=etexto.getText().toString();
        String est=dtexto.getText().toString();
        String mensaje="Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n"+
                "Estatura "+est;
        saltext.setText(mensaje);
        Toast.makeText(this,"Ingreso Con Exito",
                Toast.LENGTH_SHORT).show();
    }

    public void capturarObjetos(){
        Persona persona=new Persona(stexto.getText().toString(),
                etexto.getText().toString(),dtexto.getText().toString());
        saltext.setText(persona.salida());
        Toast.makeText(this,"Ingreso Con Exito",
                Toast.LENGTH_SHORT).show();
    }
}

