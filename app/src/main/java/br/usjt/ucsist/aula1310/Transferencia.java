package br.usjt.ucsist.aula1310;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Transferencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferencia);
    }

    public void fazerTransf(View view){
        EditText texto2 = findViewById(R.id.valorTransf);
        String valor2 = "O valor transferido foi: " + texto2.getText().toString();
        Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}