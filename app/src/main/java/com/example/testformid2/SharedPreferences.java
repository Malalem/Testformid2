package com.example.testformid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPreferences extends AppCompatActivity {
    int intYears;
    int intLoan;
    float decInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        final EditText years =(EditText) findViewById(R.id.txtYears);
        final EditText loan =(EditText) findViewById(R.id.txtLoan);
        final EditText interest =(EditText) findViewById(R.id.txtLoan);
        Button payment = (Button) findViewById(R.id.btnPayment);
        final SharedPreferences sharedpref = (SharedPreferences) PreferenceManager.getDefaultSharedPreferences(this);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intYears = Integer.parseInt(years.getText().toString());
                intLoan = Integer.parseInt(loan.getText().toString());
                decInterest = Integer.parseInt(interest.getText().toString());
                SharedPreferences.Editor editor = sharedpref.edit;
                editor.putInt("key1", intYears);
                editor.putInt("key2", intLoan);
                editor.putFloat("key3", decInterest);
                editor.commit();
                startActivity(new Intent(SharedPreferences.this, Payment.class));
            }
        });
    }
}