package com.example.pet_match.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pet_match.R;

public class PageFragment2 extends Fragment {

    public ViewGroup onCreate(@Nullable LayoutInflater inflater, ViewGroup container) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.page_2,container,false);

        return rootView;


    }
}