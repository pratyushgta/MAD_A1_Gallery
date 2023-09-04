/**
 * This class contains methods for custom image adapter to handle images in gallery
 * MAD-A1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.mad_a1_gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public Integer[] images = {
            R.drawable.v20, R.drawable.v21, R.drawable.v22, R.drawable.v23, R.drawable.v24,
            R.drawable.v25, R.drawable.v26, R.drawable.v27, R.drawable.v28, R.drawable.v29, R.drawable.v30,
            R.drawable.v31, R.drawable.v32, R.drawable.v1, R.drawable.v2, R.drawable.v3, R.drawable.v4, R.drawable.v5, R.drawable.v6,
            R.drawable.v7, R.drawable.v8, R.drawable.v9, R.drawable.v10, R.drawable.v11, R.drawable.v12,
            R.drawable.v13, R.drawable.v14, R.drawable.v15, R.drawable.v16, R.drawable.v17, R.drawable.v18,
            R.drawable.v19
    };

    public ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE); //center_crop
        imageView.setLayoutParams(new ViewGroup.LayoutParams(240, 240));
        return imageView;
    }
}
