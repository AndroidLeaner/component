package com.tony;

import android.app.Application;

import com.tony.db.MyDbHelper;

/**
 * @description 系统application
 * @author: tonyxiong
 * @date: 2022/10/16
 */
public class MyApplication extends Application {

    public static MyApplication sApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        MyDbHelper.getInstance();

    }
}
