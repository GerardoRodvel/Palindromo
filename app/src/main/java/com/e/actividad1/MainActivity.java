package com.e.actividad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //DECLARACION DE BOTONES
        //final TextView txtA = findViewById(R.id.txtA);
        final EditText txtCaja = findViewById(R.id.txtCaja);
        final Button btnVerificar = findViewById(R.id.btnVerificar);
        //TXT DE RESULTADOS
        final TextView txtResult1 = findViewById(R.id.txtResult1);
        final TextView txtResult2 = findViewById(R.id.txtResult2);
        final TextView txtResult3 = findViewById(R.id.txtResult3);
        final TextView txtResult4 = findViewById(R.id.txtResult4);



        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mensaje, decimos que recibiremos el mensaje en otra pantalla
                String cadena = txtCaja.getText().toString();
                String  cadenaInvertida="";


                //palindromo
                cadena=cadena.toLowerCase().replace(""+" ", "");

                //System.out.print(cadena);
                int fin = cadena.length()-1;
                int ini=0;
                boolean espalin=true;

                while(ini < fin){
                    if(cadena.charAt(ini)!=cadena.charAt(fin)){
                        espalin=false;
                    }
                    ini++;
                    fin--;
                }
                if(espalin) {
                    if (cadenaInvertida == cadenaInvertida) {
                        txtResult1.setText("SI");
                    }else{
                        txtResult1.setText("NO");
                        }

                }else{
                    txtResult1.setText("NO");

            }

            	//longitud palabra
                int length = cadena.length();
                txtResult2.setText(""+length);

                //cadena invertida
                for (int x=cadena.length()-1; x>=0;x--){
                    cadenaInvertida = cadenaInvertida + cadena.charAt(x);
                }
                txtResult3.setText(""+cadenaInvertida);


                //palabras repetidas
                int mayorRepeticion= 0;
                char [] letras;
                char letraRepetida = 0;

                letras = cadena.toCharArray();
                for(int i =0; i<letras.length; i++){
                    char letraActual = letras[i];
                    int contador = 0;

                    for (int j=0; j<cadena.length(); j++){
                        if (letras[j] == letraActual)
                            contador++;

                    }
                    if (mayorRepeticion < contador){
                        mayorRepeticion = contador;
                        letraRepetida = letraActual;
                    }
                }
                txtResult4.setText(""+letraRepetida);






            }
        });

    }
}
