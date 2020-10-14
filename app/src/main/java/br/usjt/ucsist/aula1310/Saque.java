package br.usjt.ucsist.aula1310;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Saque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saque);
    }

    public void sacarValor(View view){
        EditText texto1 = findViewById(R.id.valorSaque);
        String valor = "O valor sacado foi: " + texto1.getText().toString();
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}