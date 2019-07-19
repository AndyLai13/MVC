package com.andylai.mvcdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.andylai.mvcdemo.mvc.MVCActivity;
import com.andylai.mvcdemo.mvp.MVPActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mButtonMVC;
    Button mButtonMVP;
    Button mButtonMVVM;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonMVC = findViewById(R.id.btn_mvc);
        mButtonMVP = findViewById(R.id.btn_mvp);
        mButtonMVVM = findViewById(R.id.btn_mvvm);
        mButtonMVC.setOnClickListener(this);
        mButtonMVP.setOnClickListener(this);
        mButtonMVVM.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_mvc:
                startActivity(new Intent(this, MVCActivity.class));
                break;
            case R.id.btn_mvp:
                startActivity(new Intent(this, MVPActivity.class));
                break;
            case R.id.btn_mvvm:
//                startActivity(new Intent(this, MVVMActivity.class));
                break;
        }
    }
}