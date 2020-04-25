package com.example.udemy3currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moneyConvert(View view) {
        EditText ed = findViewById(R.id.editText1);
        String rupees = ed.getText().toString();

        double rupeesDouble = Double.parseDouble(rupees);
        double dollarDouble = rupeesDouble / 76;
        String amtDollar = String.format("%.2f",dollarDouble);
Toast.makeText(this,"Amount in Dollars is "+amtDollar+"$",Toast.LENGTH_LONG).show();    }
}