package com.xiangxue.new_modular_customarouter.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.xiangxue.arouter_annotation.ARouter;
import com.xiangxue.arouter_annotation.Parameter;
import com.xiangxue.arouter_api.ParameterManager;
import com.xiangxue.arouter_api.RouterManager;
import com.xiangxue.common.utils.Cons;

@ARouter(path = "/order/Order_MainActivity")
public class Order_MainActivity extends AppCompatActivity {

    @Parameter
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

        // 用到才加载 == 懒加载
        ParameterManager.getInstance().loadParameter(this);

        Log.e(Cons.TAG, "order/Order_MainActivity name:" + name);
    }

    public void jumpApp(View view) {
        Toast.makeText(this, "路由还没有写好呢，别猴急...", Toast.LENGTH_SHORT).show();
    }

    public void jumpPersonal(View view) {
        RouterManager.getInstance()
                .build("/personal/Personal_MainActivity")
                .withString("name", "李元霸")
                .withString("sex", "男")
                .withInt("age", 99)
                .navigation(this);
    }
}
