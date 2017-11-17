package com.huangfeng.activitytest;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by huangfeng on 2017/11/17.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        Log.d("BaseActivity", getClass().getSimpleName());
    }
}