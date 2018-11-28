package com.example.matinal.fragment06;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Fragment06 extends AppCompatActivity {
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment06);

        boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                Fragmento1 fragmento1 = new Fragmento1();
                FT.add(R.id.contenedor, fragmento1).commit();

            }
        });
    }
}
