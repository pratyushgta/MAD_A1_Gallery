/**
 * This class contains methods for the main/ welcome screen of the gallery app
 * MAD-A1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.example.mad_a1_gallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    Button nex_btn;
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nex_btn = findViewById(R.id.next_btn);
        desc = findViewById(R.id.home_desc);

        desc.setText(R.string.home_desc);

        nex_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(MainActivity.this, GalleryPage.class);
                startActivity(galleryIntent);
            }
        });
    }
}