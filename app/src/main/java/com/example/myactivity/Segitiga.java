package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitga);
        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final Button hasil =
                (Button)findViewById(R.id.btn_hasil);
        final TextView hasil_t =
                (TextView)findViewById(R.id.output_hasil);

        hasil.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            float alas1 = Float.parseFloat(String.valueOf(alas.getText()));
            float tinggi1 = Float.parseFloat(String.valueOf(tinggi.getText()));
            float hasil1 = alas1*tinggi1/2;
            hasil_t.setText(Float.toString(hasil1));
            }
        });
    }

}