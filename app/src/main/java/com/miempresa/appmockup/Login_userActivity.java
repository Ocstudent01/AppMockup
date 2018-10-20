package com.miempresa.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Login_userActivity extends AppCompatActivity {

    private Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        enlazarElementos();
        obtenerParametros();
    }

    private void obtenerParametros() {
        Bundle datosrecibidos = getIntent().getExtras();
        if(datosrecibidos != null){
            String datorecuperado = datosrecibidos.getString( "pantalla" );
            if(datorecuperado !=null){
                Log.i("Login_userActivity","pantalla"+ datorecuperado);
            }
        }
    }

    private void enlazarElementos(){
        btnregresar = findViewById( R.id.btnregresar );
        btnregresar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPantallamenu = new Intent( Login_userActivity.this, MenuActivity.class );
                startActivity( iPantallamenu );
                finish();
            }
        } );
    }
}
