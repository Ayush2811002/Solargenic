package com.appsnipp.homedesigns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sun extends AppCompatActivity {
    ImageView img;
    TextView ter,der;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
        img.findViewById(R.id.imageView3);
        ter.findViewById(R.id.textView2);
        der.findViewById(R.id.textView3);
    }
}