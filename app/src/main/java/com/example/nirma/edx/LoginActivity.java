package com.example.nirma.edx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signin;
        signin=(Button)findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(LoginActivity.this,
                        CourseActivity.class);
                startActivity(myIntent);
                //redirect to courese page
            }
        });
    }
}
