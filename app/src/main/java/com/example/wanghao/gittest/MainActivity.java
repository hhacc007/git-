package com.example.wanghao.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        addListener();
    }

    public void findView() {
        button = (Button) findViewById(R.id.btn_hello);
    }

    public void addListener() {
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hello world" , Toast.LENGTH_SHORT).show();
    }
}
