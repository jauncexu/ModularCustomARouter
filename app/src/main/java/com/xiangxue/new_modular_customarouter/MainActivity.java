package com.xiangxue.new_modular_customarouter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xiangxue.arouter_annotation.ARouter;
import com.xiangxue.arouter_api.RouterManager;
import com.xiangxue.common.utils.Cons;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.isRelease) {
            Log.e(Cons.TAG, "当前为：集成化模式，除app可运行，其他子模块都是Android Library");
        } else {
            Log.e(Cons.TAG, "当前为：组件化模式，app/order/personal子模块都可独立运行");
        }
    }

    public void jumpOrder(View view) {
        /*Intent intent = new Intent(this, Order_MainActivity.class);
        intent.putExtra("name", "derry");
        startActivity(intent);*/

        // 使用我们自己写的路由 跳转交互
        RouterManager.getInstance()
                .build("/order/Order_MainActivity")
                .withString("name", "杜子腾")
                .navigation(this); // 组件和组件通信
    }

    public void jumpPersonal(View view) {
        // 以前是这样跳转
        /*Intent intent = new Intent(this, Personal_MainActivity.class);
        intent.putExtra("name", "derry");
        startActivity(intent);*/

        // 使用我们自己写的路由 跳转交互
        RouterManager.getInstance()
                .build("/personal/Personal_MainActivity")
                .withString("name", "史甄湘")
                .withString("sex", "男")
                .withInt("age", 99)
                .navigation(this);
    }
}