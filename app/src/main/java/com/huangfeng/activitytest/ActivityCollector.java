package com.huangfeng.activitytest;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangfeng on 2017/11/17.
 */

public class ActivityCollector {
    private static final String TAG = "ActivityCollector";

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        Log.d(TAG, "addActivity");
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        Log.d(TAG, "removeActivity");
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:activities) {
            if (!activity.isFinishing()) {
                Log.d(TAG, "finishAll");
                activity.finish();
            }

        }
    }

}
