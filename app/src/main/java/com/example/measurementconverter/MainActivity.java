package com.example.measurementconverter;

import android.graphics.Interpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner  mySpinner = (Spinner) findViewById(R.id.spinner1);


        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this, R.array.conversion));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter((myAdapter));
    }
}
