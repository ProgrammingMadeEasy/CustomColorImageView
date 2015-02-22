package com.example.customcolorimage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.varshini.customcolorimageview.R;

/**
 * Created by Varshini on 22/02/2015.
 */
public class CustomColorImageView extends ImageView {
    public CustomColorImageView(Context context){
        super(context);
    }
    public CustomColorImageView(Context context, AttributeSet attrs){
        super(context,attrs);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.MyCustomColor);
        String imageViewColor = a.getString(0);
        a.recycle();
        setCustomColor(Color.parseColor(imageViewColor));
    }
    public void setCustomColor(int color) {
        super.setColorFilter(color);
    }
}
