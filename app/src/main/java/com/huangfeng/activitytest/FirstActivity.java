package com.huangfeng.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//     Toast.makeText(FirstActivity.this,"You clicked Button1",Toast.LENGTH_SHORT).show();
//                finish(); //关闭当前页面 相当于back

                /*
                //显卡 Intent
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                */

                /*
                * 隐式 Intent
                * */
//                Intent intent = new Intent("com.huangfeng.activitytest.ACTION_START");

                /*
                //跳转到可以响应 action_view 的活动   默认一般是 浏览器  thirdactivity  设置了action_view 的categroy 所以也能响应
                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));//响应http

                intent.setData(Uri.parse("tel:10086"));  //tel 可以拨打电话
                startActivity(intent);
                */

                //向下一个活动似递数据
                String data = "hello secondActivity";
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "you clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


}