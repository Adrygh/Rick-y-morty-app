package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        overridePendingTransition(R.anim.zoom_back_in,R.anim.zoom_back_out);
        Toast toast = Toast.makeText(MainActivity3.this, "Se nota que tus papas son hermanos", Toast.LENGTH_LONG);
        View view1 = toast.getView();
        toast.getView().setPadding(100, 100, 100, 100);
        view1.setBackground(getDrawable(R.drawable.toast_estilo));
        toast.show();

    }
}