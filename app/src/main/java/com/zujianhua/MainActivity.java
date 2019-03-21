package com.zujianhua;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.zujianhua.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {
    private Button gozujian;
    private Button login;
    private Button showUI;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        gozujian = findViewById(R.id.gozujian);
        showUI = findViewById(R.id.showUI);
        login = findViewById(R.id.login);
        frameLayout = findViewById(R.id.container);


        gozujian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmIMienService()
                        .launch(MainActivity.this, 222);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmIloginService()
                        .launch(MainActivity.this, "");
            }
        });

        showUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmIloginService().newUserInfoFragment(getSupportFragmentManager(),
                        R.id.container, bundle);
            }
        });
    }
}
