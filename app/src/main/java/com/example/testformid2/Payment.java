package com.example.testformid2;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Payment extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView monthlyPayment=(TextView) findViewById(R.id.textView);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        SharedPreferences sharedPref = (SharedPreferences) PreferenceManager.getDefaultSharedPreferences(this);
        int intYears = sharedPref.getInt("key1",0);
        int intLoan = sharedPref.getInt("key2",0);
        int decInterest = sharedPref.getFloat("key3",0);
        float decMonthlyPayment;
        decMonthlyPayment = (intLoan*(1+(decInterest*intYears)))/(12*intYears);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        if (intYears==3){
            image.setImageResource(R.drawable.three);
        }
        else if (intYears==4){
            image.setImageResource(R.drawable.four);
        }
        else if (intYears==5){
            image.setImageResource(R.drawable.five);
        }
    }
}
