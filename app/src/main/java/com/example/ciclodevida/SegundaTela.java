package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        // Recuperando os parâmetros passados
        Intent novoTexto = getIntent();
        Bundle parametros = novoTexto.getExtras();
        String sNome = parametros.getString("nome");
        String sEndereco = parametros.getString("endereco");

        TextView txtNovaActivity = (TextView) findViewById(R.id.textoNovaActivity);
        TextView txtEndereco = (TextView) findViewById(R.id.txtEndereco);
        txtNovaActivity.setTextColor(Color.parseColor("#FF0000"));
        txtNovaActivity.setText(sNome);
        txtEndereco.setTextColor(Color.parseColor("#FF00FF"));
        txtEndereco.setText(sEndereco);

        final Button btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}