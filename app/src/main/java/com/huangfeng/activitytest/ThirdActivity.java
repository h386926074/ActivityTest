package com.huangfeng.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends BaseActivity {
    private static final String TAG = "ThirdActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "This id is "+getTaskId());
        setContentView(R.layout.third_layout);

        
    }
}
