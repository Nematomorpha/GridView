package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context ctx;

    public ImageAdapter(Context context) {
        ctx = context;
    }


    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgview;

        if (convertView == null){
            imgview = new ImageView(ctx);
            imgview.setLayoutParams(new ViewGroup.LayoutParams(200, 200));
            imgview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imgview.setPadding(8, 8, 8, 8);
        }else {
            imgview = (ImageView) convertView;
        }
        imgview.setImageResource(logo[position]);
        return imgview;

    }

    public Integer[] logo = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4, R.drawable.logo5,
            R.drawable.logo6, R.drawable.logo7, R.drawable.logo8, R.drawable.logo9, R.drawable.logo10,
            R.drawable.logo11, R.drawable.logo12
    };

}
