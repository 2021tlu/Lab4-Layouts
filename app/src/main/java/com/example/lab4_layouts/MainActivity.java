package com.example.lab4_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] layouts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        layouts = new int[]{R.layout.activity_main,
                R.layout.layout1,
                R.layout.layout2,
                R.layout.layout3,
                R.layout.layout4,
                R.layout.layout5,
                R.layout.layout6,
                R.layout.layout7};
    }

    public void nextLayout(View v){
        int tag = Integer.parseInt("" + v.getTag());
        Log.i("layout","Change from " + tag + " to " + (tag+1));
        setContentView(layouts[(tag+1)%layouts.length]);
    }
    public void textButton(View v){
        String msg = (String) ((Button)v).getText();
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}