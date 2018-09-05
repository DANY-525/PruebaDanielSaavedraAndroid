package com.example.prueba.imcdaniel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText peso;
    EditText altura;
    TextView respuesta;
    Button enviar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos valores
         peso=(EditText)findViewById(R.id.peso);
         altura=(EditText)findViewById(R.id.altura);

         enviar=(Button)findViewById(R.id.enviar);


       //evento Onclick Listener
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String  alturaString=altura.getText().toString();

            String  pesoString= peso.getText().toString();

            double numeroUnoAltura  = Double.parseDouble(alturaString);
            double  numeroDosPeso  = Double.parseDouble(pesoString);
            double resultado = numeroDosPeso/Math.pow(numeroUnoAltura,2);
            //variables de comparacion
            double pesobajo = 18.50;
            double delgadezSevera = 16.50;
            double delgadezModeradaUNo =16.00;
            double delgadezModeradaDos =16.99;
            double delgadezleve =17.00;
            double delgadezleveDos =18.49;
            double normalUNo  =18.5;
            double normalDos  =22.99;
            double sobrepeso  =25.00;
            double preobeso  =29.99;
            double obecidad  =30.00;
            double obecidadleve  =30.00;
            double obecidadleveDos  =34.99;
            double obecidadMedia  =35.00;
            double obecidadMediaDos  =39.99;
            double obecidadMorbida  =40.00;

            Toast.makeText(MainActivity.this, "el resultado es "+resultado, Toast.LENGTH_SHORT).show();
            //hacemos la evaluacion dependiendo el valor

            if(resultado <= pesobajo){

                Toast.makeText(MainActivity.this, "tiene peso bajo", Toast.LENGTH_SHORT).show();

            }
            if(resultado> pesobajo && resultado <= delgadezSevera){
                Toast.makeText(MainActivity.this, "delgadez severa", Toast.LENGTH_SHORT).show();

            }
            if(resultado>delgadezSevera && resultado<=delgadezModeradaUNo && delgadezModeradaDos <= delgadezModeradaDos){

                Toast.makeText(MainActivity.this, "delgadez moderada", Toast.LENGTH_SHORT).show();
            }
            if(resultado>delgadezModeradaUNo && resultado <= delgadezleve  && resultado <= delgadezleveDos ){


                Toast.makeText(MainActivity.this, "delgadez leve", Toast.LENGTH_SHORT).show();

            }
            if(resultado>delgadezleveDos && resultado <= normalUNo && resultado <= normalDos){


                Toast.makeText(MainActivity.this, "Normal", Toast.LENGTH_SHORT).show();

            }
            if(resultado >= sobrepeso){

                Toast.makeText(MainActivity.this, "Sobrepeso", Toast.LENGTH_SHORT).show();

            }


            if(resultado> sobrepeso && resultado <=preobeso){


                Toast.makeText(MainActivity.this, "preobeso"+preobeso, Toast.LENGTH_SHORT).show();

            }


            if(resultado>= sobrepeso && resultado<=obecidad){

                Toast.makeText(MainActivity.this, "obesidad"+obecidad, Toast.LENGTH_SHORT).show();


            }

            if(resultado>= obecidad  && resultado<=obecidadleve && resultado<=obecidadleveDos){


                Toast.makeText(MainActivity.this, "obesidad leve"+obecidadleve+"num2"+obecidadleveDos, Toast.LENGTH_SHORT).show();


            }
            if(resultado>=obecidadleveDos && resultado <= obecidadMedia&& resultado <=obecidadMediaDos){


                Toast.makeText(MainActivity.this, "obesidad Media DOs", Toast.LENGTH_SHORT).show();


            }
            if(resultado>=obecidadMorbida){

                Toast.makeText(MainActivity.this, "obesidad Morbida", Toast.LENGTH_SHORT).show();

            }




            }
        });




    }
}
