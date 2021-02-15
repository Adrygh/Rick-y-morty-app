package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        overridePendingTransition(R.anim.zoom_forward_in,R.anim.zoom_forward_out);
        Toast toast = Toast.makeText(MainActivity6.this, "Eres ligeramente estupido", Toast.LENGTH_LONG);
        View view1 = toast.getView();
        toast.getView().setPadding(100, 100, 100, 100);
        view1.setBackground(getDrawable(R.drawable.toast_estilo));
        toast.show();
    }
}