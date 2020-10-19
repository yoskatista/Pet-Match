package com.example.pet_match;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

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

public class TelaFinalActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());
        list.add(new PageFragment4());
        list.add(new PageFragment5());
        list.add(new PageFragment6());
        list.add(new PageFragment7());
        list.add(new PageFragment8());
        list.add(new PageFragment9());


        pager = findViewById(R.id.Pager);
        pagerAdapter = new SliderPageAdapter(getSupportFragmentManager(),list);

        //pager.setAdapter(pagerAdapter);

        pager.setAdapter(pagerAdapter);

        System.out.println(pager.getCurrentItem());


    }
}
