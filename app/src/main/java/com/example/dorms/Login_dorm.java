package com.example.dorms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Login_dorm extends AppCompatActivity {
    Button login,f_password;
    TextView no_acc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_dorm);

        login=findViewById(R.id.login);
        f_password=findViewById(R.id.f_passwd);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHome();
            }
        });
        f_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openf_password();
            }
        });



    }
    public void openHome(){
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
    public void openf_password(){
        Intent intent=new Intent(this,Forgot_Passwd.class);
        startActivity(intent);
    }


}