package com.andylai.mvc;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MVCView extends AppCompatActivity implements View.OnClickListener {

    Button mShowMemberList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowMemberList = findViewById(R.id.showMemberList);
        mShowMemberList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.showMemberList:
                Intent intent = new Intent(this, MemberListView.class);
                startActivity(intent);
//                intent = new Intent("andylai.intent.action.SHOW_MEMBER_LIST");
//                startActivity(intent);
                break;
        }
    }
}
