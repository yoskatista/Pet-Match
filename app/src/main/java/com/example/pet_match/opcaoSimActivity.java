package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opcaoSimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcao_sim);
    }

    public void StartTelaFinalActivity (View view){
        Intent TelaFinalActivity = new Intent(this,TelaFinalActivity.class);
        startActivity(TelaFinalActivity);
    }

}
