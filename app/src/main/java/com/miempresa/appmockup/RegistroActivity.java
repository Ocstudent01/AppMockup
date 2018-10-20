package com.miempresa.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistroActivity extends AppCompatActivity {
    //@BindView( R.id.btnregresar ) Button btnregresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registro );
        ButterKnife.bind( this );
        obtenerParametros();

    }

    private void obtenerParametros() {
        Bundle datosrecibidos = getIntent().getExtras();
        if(datosrecibidos != null){
            String datorecuperado = datosrecibidos.getString( "pantalla" );
            if(datorecuperado !=null){
                Log.i("RegistroActivity","pantalla"+ datorecuperado);
            }
        }
    }

    @OnClick(R.id.btnregresar)
    void regresarPantallaMenu(){
        Intent iPantallamenu = new Intent( RegistroActivity.this, MenuActivity.class );
        startActivity( iPantallamenu );
        finish();
    }


}
