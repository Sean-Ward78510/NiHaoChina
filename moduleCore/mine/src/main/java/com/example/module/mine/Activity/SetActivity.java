package com.example.module.mine.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.module.mine.R;
@Route(path = "/mine/SetActivity")
public class SetActivity extends AppCompatActivity implements View.OnClickListener{
    Button banned;
    Button exit;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        banned = (Button) findViewById(R.id.banned);
        exit = (Button) findViewById(R.id.exit);

        banned.setOnClickListener(this);
        exit.setOnClickListener(this);
    }
    public void exitAccount(){
        sp = getSharedPreferences("Login_State",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("isLogin",false);
        editor.putString("name",null);
        editor.putString("phone",null);
        editor.putString("email",null);
        editor.putString("photo",null);
        editor.apply();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.banned){

        }
        if (view.getId() == R.id.exit){
            exitAccount();
            finish();
        }
    }
}