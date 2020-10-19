package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void StartTelaContrato1Activity (View view){
        Intent TelaContrato1Activity = new Intent(this,TelaContrato1Activity.class);
        startActivity(TelaContrato1Activity);
    }
}
