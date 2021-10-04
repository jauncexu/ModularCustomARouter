package com.xiangxue.new_modular_customarouter.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xiangxue.arouter_annotation.ARouter;
import com.xiangxue.arouter_annotation.Parameter;
import com.xiangxue.arouter_api.ParameterManager;

@ARouter(path = "/personal/Personal_MainActivity")
public class Personal_MainActivity extends AppCompatActivity {
    @Parameter
    String name; // 序列号 String

    @Parameter
    String sex;

    @Parameter
    int age = 9;   // 序列号  int


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);

        // 模仿人家了
        // bind(this);

        ParameterManager.getInstance().loadParameter(this);
    }

    public void jumpApp(View view) {
        Toast.makeText(this, "路由还没有写好呢，别猴急...", Toast.LENGTH_SHORT).show();
    }

    public void jumpOrder(View view) {
        Toast.makeText(this, "路由还没有写好呢，别猴急...", Toast.LENGTH_SHORT).show();
    }
}
