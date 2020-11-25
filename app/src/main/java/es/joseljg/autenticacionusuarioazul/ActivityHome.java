package es.joseljg.autenticacionusuarioazul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import es.joseljg.autenticacionusuarioazul.clases.Usuario;

public class ActivityHome extends AppCompatActivity {

    TextView txt_email = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txt_email = (TextView) findViewById(R.id.txt_email);
        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        if(email != null)
        {
            txt_email.setText(email);
        }
        Usuario u = (Usuario) intent.getSerializableExtra(RegistroActivity.EXTRA_OBJETO_USUARIO);
        if(u != null)
        {
            txt_email.setText(u.getNombre());
        }
    }
}