package com.example.it;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tTexto1 = findViewById(R.id.tTexto1);
        final EditText eNombreUsuario = findViewById(R.id.eNombreUsuario);
        eNombreUsuario.getText().toString().toLowerCase().equals("morty");
        final ImageView ibotonEntrar = findViewById(R.id.ibotonEntrar);
        final Animation animacionboton = AnimationUtils.loadAnimation(this, R.anim.animacionboton);

        ibotonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( eNombreUsuario.getText().toString().toLowerCase().equals("morty")){
                    ibotonEntrar.startAnimation(animacionboton);
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    finish();
                }
            }
        });


    }
}