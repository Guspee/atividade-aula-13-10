package br.usjt.ucsist.aula1310;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle dados = getIntent().getExtras();
        String codigo = dados.getString("codigo");
        TextView codigoHide = findViewById(R.id.codigoHide);
        codigoHide.setText(codigo);
    }

    public void validarSenha(View view) {
        TextView pegarCodigo = findViewById(R.id.codigoHide);
        String codigo = pegarCodigo.getText().toString();
        EditText texto = findViewById(R.id.senhaNum);
        String senha = texto.getText().toString();
        String erro = "senha incorreta";
        if (senha.equals("123456")) {
            if (codigo.equals("1")) {
                Intent intent = new Intent(this, Extrato.class);
                startActivity(intent);
            }
            if (codigo.equals("2")) {
                Intent intent = new Intent(this, Saque.class);
                startActivity(intent);
            }
            if (codigo.equals("3")) {
                Intent intent = new Intent(this, Transferencia.class);
                startActivity(intent);
            }
        } else {
            Toast.makeText(this, erro, Toast.LENGTH_SHORT).show();

//        if (codigo.equals("1")) {
//            Intent intent = new Intent(this, Extrato.class);
//            startActivity(intent);
//        }
//        if (codigo.equals("2")) {
//            Intent intent = new Intent(this, Saque.class);
//            startActivity(intent);
//        }
//        if (codigo.equals("3")) {
//            Intent intent = new Intent(this, Transferencia.class);
//            startActivity(intent);
//


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        Intent origemIntent = getIntent();
//
//    }
//    public void validarSenha(View view) {
//        EditText texto = findViewById(R.id.senhaNum);
//        String senha = texto.getText().toString();
//        String erro = "senha incorreta";
//        if (senha.equals("123456")) {
//            Intent intent = new Intent(this, Extrato.class);
//            startActivity(intent);
//        } else {
//            Toast.makeText(this, erro, Toast.LENGTH_SHORT).show();
//        }
//    }
//}
        }
    }
}