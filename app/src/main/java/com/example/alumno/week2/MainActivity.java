package com.example.alumno.week2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt = (EditText) findViewById(R.id.editText);
        txt.setText(getResources().getString(R.string.frase));

        int txtIn = Integer.parseInt(findViewById(R.id.txtIn).toString());

        int txtFin = Integer.parseInt(findViewById(R.id.txtFin).toString());


        //btn.setTextColor(Color.parseColor("#bdbdbd"));
        //btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        //  btn.setTextColor(Color.BLUE);
//btn.setTextColor(Color.argb(450,56,4,8));
        //btn.setBackgroundColor(Color.YELLOW);
        Button btnR = (Button) findViewById(R.id.btnRojo);

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(getResources().getString(R.string.frase));

                int txtIn = Integer.parseInt(findViewById(R.id.txtIn).toString());

                int txtFin = Integer.parseInt(findViewById(R.id.txtFin).toString());

                Editable ed = txt.getText();

                ed.setSpan(new ForegroundColorSpan(Color.RED), txtIn, txtFin, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            }


        });
        Button btnN = (Button) findViewById(R.id.btnNegro);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(getResources().getString(R.string.frase));
                int txtIn = Integer.parseInt(findViewById(R.id.txtIn).toString());

                int txtFin = Integer.parseInt(findViewById(R.id.txtFin).toString());

                Editable ed = txt.getText();

                ed.setSpan(new ForegroundColorSpan(Color.BLACK), txtIn, txtFin, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            }


        });

        Button btnS = (Button) findViewById(R.id.btnSel);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(getResources().getString(R.string.frase));

                int txtIn = Integer.parseInt(findViewById(R.id.txtIn).toString());

                int txtFin = Integer.parseInt(findViewById(R.id.txtFin).toString());

                txt.setSelection(txtIn, txtFin);

            }


        });

        Button btnT = (Button) findViewById(R.id.btnTam);

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText txt = (EditText) findViewById(R.id.editText);
                txt.setText(getResources().getString(R.string.frase));
                int txtIn = Integer.parseInt(findViewById(R.id.txtIn).toString());

                int txtFin = Integer.parseInt(findViewById(R.id.txtFin).toString());

                Editable ed = txt.getText();

                ed.setSpan(new AbsoluteSizeSpan(100), txtIn, txtFin, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            }


        });

    }
}




                //txt.setText(String.valueOf(color));
              /*if (color == Color.BLUE) {
                    txt.setText("AZUL");


                }
                */
             //txt.setVisibility(View.GONE);
               // txt.setVisibility(View.VISIBLE);

               // txt.setEnabled(false);

                //txt.setInputType(InputType.TYPE_CLASS_DATETIME);



                /* Editable ed = txt.getText();

                ed.setSpan(new StyleSpan(Typeface.BOLD), 5, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed.setSpan(new ForegroundColorSpan(Color.BLUE), 5, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                ed.setSpan(new AbsoluteSizeSpan(50), 10, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


                //int inicio = txt.getSelectionStart();
                //int fin = txt.getSelectionEnd();

                String[]dia =getResources().getStringArray(R.array.dia);

                for(int i = 0; i <dias.length; i++) {
                    menssaje = mensaje +dia[1];

                }
                */
/*
int count = 2;

        String mensaje = getResources().getQuantityString(R.plurals.numeroCancionesPermitidas, count);
                txt.setText(mensaje);

            }


        });

    }
}
*/

