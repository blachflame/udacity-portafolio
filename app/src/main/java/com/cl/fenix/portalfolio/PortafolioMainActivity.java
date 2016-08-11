package com.cl.fenix.portalfolio;

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


    }

    public void toastMessage(View v) {
        Button boton = (Button)v;
        CharSequence text = "This button will launch my " + boton.getText() + " App";
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }


}
