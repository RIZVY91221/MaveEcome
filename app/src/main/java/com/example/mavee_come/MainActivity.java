package com.example.mavee_come;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button joinNow_btn,login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joinNow_btn=(Button)findViewById(R.id.main_join_now_btn);
        login_btn=(Button)findViewById(R.id.main_login_btn);
        
    }
}
