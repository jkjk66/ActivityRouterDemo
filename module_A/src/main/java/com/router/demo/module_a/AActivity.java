package com.router.demo.module_a;

import android.app.Activity;
import android.os.Bundle;

import com.github.mzule.activityrouter.annotation.Router;

@Router("activity_a")
public class AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

}
