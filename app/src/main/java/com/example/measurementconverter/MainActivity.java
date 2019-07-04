package com.example.measurementconverter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] conversion = { "Miles to Kilometers", "Kilometers to Mile ", "Inches to Centimeters", "Centimeters to Inches" };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner
        Spinner spinner = findViewById(R.id.spinner);

        //
        ArrayAdapter<CharSequence> adapter = ArrayAdapter
                .createFromResource(this,
                        R.array.units, android.R.layout.simple_spinner_item);
        //layout of list choices
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,long id) {

        TextView TextView_to = findViewById(R.id.TextView_from);
        TextView TextView_from = findViewById(R.id.TextView_to);
        TextView TextViewEquals = findViewById(R.id.TextViewEquals);
        EditText EditTextEnter = findViewById(R.id.EditTextEnter);

//Ratios

        double mi_km = 1.6093;
        double km_mi = 0.6214;
        double in_cm = 2.54;
        double cm_in = 0.3937;

            switch (position) {

                case 0:

                    TextView_from.setText(getString(R.string.miles));
                    TextView_to.setText(getString(R.string.kilometers));


                    if (!EditTextEnter.getText().toString().isEmpty()) {
                        double fromD = Double.parseDouble(EditTextEnter.getText().toString());
                        double result = fromD * mi_km;
                        String resultFormatted = String.format(Locale.ENGLISH, "%.2f", result);
                        TextViewEquals.setText(resultFormatted);
                    }

                    break;


                case 1:
                    TextView_from.setText(getString(R.string.kilometers));
                    TextView_to.setText(getString(R.string.miles));


                    if (!EditTextEnter.getText().toString().isEmpty()) {
                        double fromD = Double.parseDouble(EditTextEnter.getText().toString());
                        double result = fromD * km_mi;
                        String resultFormatted = String.format(Locale.ENGLISH, "%.2f", result);
                        TextViewEquals.setText(resultFormatted);
                    }

                    break;
                case 2:

                    TextView_from.setText(getString(R.string.inches));
                    TextView_to.setText(getString(R.string.centimeters));

                    if (!EditTextEnter.getText().toString().isEmpty()) {
                        double fromD = Double.parseDouble(EditTextEnter.getText().toString());
                        double result = fromD * in_cm;
                        String resultFormatted = String.format(Locale.ENGLISH, "%.2f", result);
                        TextViewEquals.setText(resultFormatted);
                    }

                    break;


                case 3:
                    TextView_from.setText(getString(R.string.centimeters));
                    TextView_to.setText(getString(R.string.inches));

                    if (!EditTextEnter.getText().toString().isEmpty()) {
                        double fromD = Double.parseDouble(EditTextEnter.getText().toString());
                        double result = fromD * cm_in;
                        String resultFormatted = String.format(Locale.ENGLISH, "%.2f", result);
                        TextViewEquals.setText(resultFormatted);
                    }

                    break;





            }


    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }
}