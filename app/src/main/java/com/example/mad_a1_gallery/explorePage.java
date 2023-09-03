package com.example.mad_a1_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class explorePage extends AppCompatActivity {
    Button back;
    ImageView img1;
    ImageView img2;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_page);

        back = findViewById(R.id.back_btn);
        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);
        spinner = findViewById(R.id.spinner);

        String[] menu = {"One","Two","Three"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>()
    }
}