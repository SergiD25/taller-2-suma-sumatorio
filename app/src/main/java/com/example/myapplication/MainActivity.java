package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt;
    Button btn;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    Button botonsumatoria;
    Button botonsuma;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        txt1 = (TextView) findViewById(R.id.Resualtado);
        txt2 = (TextView) findViewById(R.id.Resualtado2);
        txt3 = (TextView) findViewById(R.id.Resualtado3);
        botonsumatoria = (Button) findViewById(R.id.button3);
        botonsuma = (Button) findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Random random = new Random();
                int val = random.nextInt(100);
                txt.setText(Integer.toString(val));
            }
        });
        botonsumatoria.setOnClickListener(this);
        botonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();

            }
        });
    }
    public void onClick(View view) {
        float traer;
        float res = 0;
        traer = Float.parseFloat(txt.getText().toString());

        res=  (traer * (traer + 1)) / 2;

        txt1.setText("El resultado es " + res);
        txt2.setText("El resultado es " + res);
        txt3.setText("El resultado es " + res);
        }
    public void suma(){
        float traer;
        float res = 0;
        traer = Float.parseFloat(txt.getText().toString());

        res=  traer + traer + traer;

        txt1.setText("El resultado es " + res);
        txt2.setText("El resultado es " + res);
        txt3.setText("El resultado es " + res);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}