package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pet_match.fragments.PageFragment1;
import com.example.pet_match.fragments.PageFragment2;
import com.example.pet_match.fragments.PageFragment3;
import com.example.pet_match.fragments.PageFragment4;
import com.example.pet_match.fragments.PageFragment5;
import com.example.pet_match.fragments.PageFragment6;
import com.example.pet_match.fragments.PageFragment7;
import com.example.pet_match.fragments.PageFragment8;
import com.example.pet_match.fragments.PageFragment9;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void startmainActivity(View view) {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }

    public void startSegundaTelaActivity(View view) {
        Intent SegundaTelaActivity = new Intent(this, SegundaTelaActivity.class);
        startActivity(SegundaTelaActivity);
    }

    public void StartCadastroActivity(View view) {
        Intent CadastroActivity = new Intent(this, CadastroActivity.class);
        startActivity(CadastroActivity);
    }

    public class TelaFinalActivity extends AppCompatActivity {



        //Sempre criar na tela anterior a partir de novas telas


    }

}