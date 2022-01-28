package com.example.musica5c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    EditText txtAutore;
    Button btnInserisci;
    Spinner spnGen;

    String[] genMusicali = {"Pop", "Rock", "Liscio", "Dance"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb = new GestioneBrani();
        txtAutore = (EditText)findViewById(R.id.txtAutore);
        spnGen = (Spinner)findViewById(R.id.spnGen);
        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genMusicali);


        btnInserisci = (Button) findViewById(R.id.btnRicerca);
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String generesel = spnGen.getSelectedItem().toString();
            }
        });
    }
}
