package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        Toast toast = Toast.makeText(MainActivity4.this, "Bua! mierda de decision", Toast.LENGTH_LONG);
        View view1 = toast.getView();
        toast.getView().setPadding(100, 100, 100, 100);
        view1.setBackground(getDrawable(R.drawable.toast_estilo));
        toast.show();

    }
}