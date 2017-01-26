package com.example.thierry.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText valeur1, valeur2;
    public Button addition, soustraction, division, multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valeur1= (EditText)findViewById(R.id.valeurUn);
        valeur2=(EditText)findViewById(R.id.valeurDeux);
        addition= (Button)findViewById(R.id.addition);
        soustraction= (Button)findViewById(R.id.soustraction);
        multiplication= (Button)findViewById(R.id.multiplication);
        division= (Button)findViewById(R.id.division);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nombre1=Integer.parseInt(valeur1.getText().toString());
                int nombre2=Integer.parseInt(valeur2.getText().toString());
                int  somme= nombre1+nombre2;
                Toast.makeText(getApplicationContext(),String.valueOf(somme),Toast.LENGTH_LONG).show();
            }
        });

    }

}
