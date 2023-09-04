package com.example.mad_a1_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class GalleryPage extends AppCompatActivity {
    Button back;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_page);

        back = findViewById(R.id.back_btn);
        gridView = findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent FullScreenIntent = new Intent(getApplicationContext(),FullScreenImage.class);
                FullScreenIntent.putExtra("id",i);
                startActivity(FullScreenIntent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(GalleryPage.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}