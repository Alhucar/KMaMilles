package com.example.alvaro.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnaMilles =(Button) findViewById(R.id.buttonKMaMilles);
        Button btnaKM =(Button) findViewById(R.id.buttonMillesaKM);


        final EditText textKM = (EditText) findViewById(R.id.textKM);
        final EditText textMilles = (EditText) findViewById(R.id.textMilles);


        btnaMilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SKM = textKM.getText().toString();
                float KM = Float.parseFloat(SKM);
                float milles = KM / 1.609f;
                String SMilles = String.format("%f", milles);
                textMilles.setText(SMilles);

            }
        });

        btnaKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SMilles = textMilles.getText().toString();
                float milles = Float.parseFloat(SMilles);
                float KM = milles * 1.609f;
                String SKM = String.format("%f", KM);
                textKM.setText(SKM);

            }
        });


    }
}
