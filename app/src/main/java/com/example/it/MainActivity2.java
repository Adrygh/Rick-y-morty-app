package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView ventana1 = findViewById(R.id.ventana1);
        overridePendingTransition(R.anim.zoom_back_in,R.anim.zoom_back_out);
        Animation animacionportal = AnimationUtils.loadAnimation(this, R.anim.portales);
        Animation animacionportal2 = AnimationUtils.loadAnimation(this,R.anim.portales2);
        ventana1.startAnimation(animacionportal);
        ventana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        ImageView ventana2 = findViewById(R.id.ventana2);
        ventana2.startAnimation(animacionportal2);
        ventana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        ImageView ventana3 = findViewById(R.id.ventana3);
        ventana3.startAnimation(animacionportal);
        ventana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        ImageView ventana4 = findViewById(R.id.ventana4);
        ventana4.startAnimation(animacionportal2);
        ventana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}