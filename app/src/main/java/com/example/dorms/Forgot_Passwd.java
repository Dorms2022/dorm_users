package com.example.dorms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Forgot_Passwd extends AppCompatActivity {

    AppCompatButton reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passwd);

        reset=(AppCompatButton)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openc_passwd();
            }
        });

    }
    public void openc_passwd(){
        Intent intent=new Intent(this,Change_passwd.class);
        startActivity(intent);
    }

}