package com.router.demo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.mzule.activityrouter.router.Routers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_a).setOnClickListener(this);
        findViewById(R.id.button_b).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_a:
                Log.e("onClick","button_a");
                Routers.open(this, Uri.parse("jumpdemo://activity_a"));
                break;

            case R.id.button_b:
                Log.e("onClick","button_b");
                Routers.open(this, Uri.parse("jumpdemo://activity_b"));
                break;
        }
    }
}
