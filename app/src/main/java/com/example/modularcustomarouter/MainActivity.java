package com.example.modularcustomarouter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiangxue.arouter_annotation.ARouter;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}