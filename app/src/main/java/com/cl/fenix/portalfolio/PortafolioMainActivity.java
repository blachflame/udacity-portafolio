package com.cl.fenix.portalfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortafolioMainActivity extends AppCompatActivity {

    final int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portafolio_main);
        final Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.primeraOpcion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button boton = (Button)v;
                CharSequence text = "This button will launch my " + boton.getText() + " App";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

         button = (Button) findViewById(R.id.segundaOpcion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button boton = (Button)v;
                CharSequence text = "This button will launch my " + boton.getText() + " App";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button = (Button) findViewById(R.id.terceraOpcion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button boton = (Button)v;
                CharSequence text = "This button will launch my " + boton.getText() + " App";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button = (Button) findViewById(R.id.cuartaOpcion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button boton = (Button)v;
                CharSequence text = "This button will launch my " + boton.getText() + " App";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button = (Button) findViewById(R.id.quintaOpcion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button boton = (Button)v;
                CharSequence text = "This button will launch my " + boton.getText() + " App";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }



}
