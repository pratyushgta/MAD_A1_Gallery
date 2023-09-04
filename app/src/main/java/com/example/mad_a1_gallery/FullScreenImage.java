/**
 * This class contains methods for viewing images in full screen upon clicking them
 * MAD-A1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.mad_a1_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FullScreenImage extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        back = findViewById(R.id.back_btn);

        Intent GalleryIntent = getIntent();
        int position = GalleryIntent.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);

        ImageView imageView = findViewById(R.id.full_image);
        imageView.setImageResource(adapter.images[position]);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(FullScreenImage.this, GalleryPage.class);
                startActivity(galleryIntent);
            }
        });
    }
}