package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtcreate,txtresume,txtstop,txtrestart;
    static int stop,create,resume,restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create++;
        txtcreate=findViewById(R.id.tvcreate);
        txtrestart=findViewById(R.id.tvrestart);
        txtresume=findViewById(R.id.tvresume);
        txtstop=findViewById(R.id.tvstop);

        txtcreate.setText(create);
    }
    @Override
    protected void onStop() {
        super.onStop();
        stop++;
        txtstop.setText(stop);
    }
    @Override
    protected void onResume() {
        super.onResume();
        resume++;
        txtresume.setText(resume);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart++;
        txtrestart.setText(restart);
    }
}