package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }

    public void StartActivityTela3 (View view){
        Intent ActivityTela3 = new Intent(this,ActivityTela3.class);
        startActivity(ActivityTela3);
    }
}
