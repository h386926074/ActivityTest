package com.huangfeng.activitytest;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class ThirdActivity extends BaseActivity {
    private static final String TAG = "ThirdActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "This id is "+getTaskId());
        setContentView(R.layout.third_layout);

        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
//                android.os.Process.killProcess(android.os.Process.myPid());
                Log.d(TAG, "onClick: "+android.os.Process.myPid());
            }
        });
    }
}
