package com.trichain.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,digit0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        digit1=findViewById(R.id.button14);
         digit1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });

    }
}