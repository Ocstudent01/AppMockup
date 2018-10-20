package com.miempresa.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btningresar;
    private  Button btnregistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu );
        enlazarElementos();
        confirmarEventoClick();
    }
    private void confirmarEventoClick(){
        btningresar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datosEnviar = new Bundle(  );
                datosEnviar.putString( "pantalla","Login" );
                //creaccion del intent para cambiar de pantalla
                Intent iPantallaLogin = new Intent(
                        MenuActivity.this, Login_userActivity.class );
                iPantallaLogin.putExtras( datosEnviar );

                startActivity( iPantallaLogin );
                finish();//para cerrar la actividad actual
            }
        } );

        btnregistrar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datosEnviar = new Bundle(  );
                datosEnviar.putString( "pantalla","registro" );

                //creaccion del intent para cambiar de pantalla
                Intent iPantallaRegistro = new Intent(
                        MenuActivity.this, RegistroActivity.class );
                iPantallaRegistro.putExtras( datosEnviar );
                startActivity( iPantallaRegistro );
                finish();//para cerrar la actividad actual
            }
        } );
    }
    private void enlazarElementos(){
        btningresar = findViewById( R.id.btnIngresar );
        btnregistrar = findViewById( R.id.btnRegistrar );
    }

}


