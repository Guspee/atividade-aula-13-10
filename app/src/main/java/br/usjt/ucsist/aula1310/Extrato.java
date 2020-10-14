package br.usjt.ucsist.aula1310;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Extrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);
        Intent origemIntent = getIntent();
    }
    public void retornar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}