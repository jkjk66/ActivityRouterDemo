package com.router.demo;

import android.app.Application;

import com.github.mzule.activityrouter.annotation.Modules;

/**
 * Created by cym1497 on 2017/7/14.
 */


@Modules("app")
public class AppClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
