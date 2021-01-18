package com.mrsoftit.imagefilter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import com.zomato.photofilters.SampleFilters;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zomato.photofilters.imageprocessors.Filter;
import com.zomato.photofilters.imageprocessors.subfilters.BrightnessSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.ContrastSubFilter;

public class MainActivity extends AppCompatActivity {

    static
    {
        System.loadLibrary("NativeImageProcessor");
    }
    ImageView imageView,imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =findViewById(R.id.imageview);

        imageView1 =findViewById(R.id.Imageview_itemView1);
        imageView2 =findViewById(R.id.Imageview_itemView2);
        imageView3 =findViewById(R.id.Imageview_itemView3);

        //thumbImage1
        Filter myFilter = SampleFilters.getBlueMessFilter();
        myFilter.addSubFilter(new BrightnessSubFilter(30));
        myFilter.addSubFilter(new ContrastSubFilter(1.1f));
        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = bitmapDrawable.getBitmap();
        Bitmap inputImage1 = bitmap.copy(Bitmap.Config.ARGB_8888,true);
        Bitmap outpot1 = myFilter.processFilter(inputImage1);
        imageView1.setImageBitmap(outpot1);

        //thumbImage2
        Filter myFilter2 = SampleFilters.getLimeStutterFilter();
        myFilter2.addSubFilter(new BrightnessSubFilter(30));
        myFilter2.addSubFilter(new ContrastSubFilter(1.1f));
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
        Bitmap inputImage2 = bitmap2.copy(Bitmap.Config.ARGB_8888,true);
        Bitmap outpot2 = myFilter2.processFilter(inputImage2);
        imageView2.setImageBitmap(outpot2);

        //thumbImage3
        Filter myFilter3 = SampleFilters.getNightWhisperFilter();
        myFilter3.addSubFilter(new BrightnessSubFilter(30));
        myFilter3.addSubFilter(new ContrastSubFilter(1.1f));
        BitmapDrawable bitmapDrawable3 = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap3 = bitmapDrawable3.getBitmap();
        Bitmap inputImage3 = bitmap3.copy(Bitmap.Config.ARGB_8888,true);
        Bitmap outpot3 = myFilter3.processFilter(inputImage3);
        imageView3.setImageBitmap(outpot3);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Filter myFilter = SampleFilters.getBlueMessFilter();
                myFilter.addSubFilter(new BrightnessSubFilter(30));
                myFilter.addSubFilter(new ContrastSubFilter(1.1f));
                BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Bitmap inputImage1 = bitmap.copy(Bitmap.Config.ARGB_8888,true);
                Bitmap outpot1 = myFilter.processFilter(inputImage1);
                imageView.setImageBitmap(outpot1);

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //thumbImage2
                Filter myFilter2 = SampleFilters.getLimeStutterFilter();
                myFilter2.addSubFilter(new BrightnessSubFilter(30));
                myFilter2.addSubFilter(new ContrastSubFilter(1.1f));
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                Bitmap inputImage2 = bitmap2.copy(Bitmap.Config.ARGB_8888,true);
                Bitmap outpot2 = myFilter2.processFilter(inputImage2);
                imageView.setImageBitmap(outpot2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //thumbImage1
                Filter myFilter3 = SampleFilters.getNightWhisperFilter();
                myFilter3.addSubFilter(new BrightnessSubFilter(30));
                myFilter3.addSubFilter(new ContrastSubFilter(1.1f));
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap3 = bitmapDrawable3.getBitmap();
                Bitmap inputImage3 = bitmap3.copy(Bitmap.Config.ARGB_8888,true);
                Bitmap outpot3 = myFilter3.processFilter(inputImage3);
                imageView.setImageBitmap(outpot3);

            }
        });
    }
}