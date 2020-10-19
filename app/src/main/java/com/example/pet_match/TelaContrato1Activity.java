package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaContrato1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_contrato1);
    }

    public void StartOpcaoNaoActivity (View view){
        Intent opcaoNao = new Intent(this,opcaoNao.class);
        startActivity(opcaoNao);
    }

    public void StartOpcaoSimActivity (View view){
        Intent opcaoSimActivity = new Intent(this,opcaoSimActivity.class);
        startActivity(opcaoSimActivity);
    }


}
