package com.xiangxue.new_modular_customarouter;

import android.os.Bundle;

import com.xiangxue.arouter_annotation.ARouter;

import androidx.appcompat.app.AppCompatActivity;

@ARouter(path = "/app/Main2Activity")
public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
