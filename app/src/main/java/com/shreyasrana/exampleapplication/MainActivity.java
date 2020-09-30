package com.shreyasrana.exampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int increment = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View v){
        TextView display = findViewById(R.id.Score);
        int count = Integer.parseInt(display.getText().toString());
        count += increment;
        display.setText(Integer.toString(count));
    }

    public void Multiplier2X(View v){
        //TODO: implement
    }

    public void Multiplier4X(View v){
        //TODO: implement
    }
}
