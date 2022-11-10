package com.example.exemplo7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView lista = (ListView) findViewById(R.id.ListView);
        ArrayList<String> configurar = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, configurar );
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:

                        Intent intent = new Intent(Lista.this, DeviceScanActivity.class);
                        startActivity(intent);

                        break;
                }

            }
        });





    }


    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Tipo de Controle");
        dados.add("Manual");
        dados.add("Configurar Valvula");
        dados.add("Configurar Controle");





        return dados;
    }
}