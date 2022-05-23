package com.example.ussduzbekistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imageSlider);
        Button button;

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.milliy15_uzmobile,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.oson10beeline,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.mobiuz_gapyoq,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sof_ucell,ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ussd = "*100*1" + Uri.encode("#");
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ussd)));
            }
        });
    }
}