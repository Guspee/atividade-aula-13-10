package br.usjt.ucsist.aula1310;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getSaque(View view) {
        Intent intent = new Intent(this, login.class);
        intent.putExtra("codigo", "2");
        startActivity(intent);

    }

    public void getExtrato(View view) {
        Intent intent = new Intent(this, login.class);
        intent.putExtra("codigo", "1");
        startActivity(intent);

    }

    public void getTransferencia(View view) {
        Intent intent = new Intent(this, login.class);
        intent.putExtra("codigo", "3");
        startActivity(intent);

    }
}