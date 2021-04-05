package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Executando onCreate!", Toast.LENGTH_LONG).show();

        final Button btNovaActivity = findViewById(R.id.btNovaActivity);
        btNovaActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent segundaActivity = new Intent(MainActivity.this, SegundaTela.class);

                // Passando parâmetros
                Bundle bundle = new Bundle();
                bundle.putString("nome", "João da Silva");
                bundle.putString("endereco", "Av da Saudade, 396");
                segundaActivity.putExtras(bundle);

                startActivity(segundaActivity);
            }
        });

        final Button btnChrome = findViewById(R.id.btnChrome);
        btnChrome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "http://www.autoracing.com.br";

                // Identificando a Activity a ser aberta (Chrome)
                Intent navegador = new Intent(Intent.ACTION_VIEW);

                // Passando a URL como parâmetro para o navegador (Chrome)
                navegador.setData(Uri.parse(url));

                // Abrindo o navegador (Chrome)
                startActivity(navegador);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Executando onStart!",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Executando onResume!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Executando onPause!",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Socorro!",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Fui...",Toast.LENGTH_LONG).show();
    }
}