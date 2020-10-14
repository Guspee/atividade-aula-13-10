//package br.usjt.ucsist.aula1310;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class loginSaque extends AppCompatActivity {
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
//            Intent intent = new Intent(this, Saque.class);
//            startActivity(intent);
//        } else {
//            Toast.makeText(this, erro, Toast.LENGTH_SHORT).show();
//        }
//    }
//}