package com.example.lenovo.allahgretestname;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        Intent intent=new Intent(this, Activity2.class);
        startActivity(intent);
    }


    public void buttonClick(View view) {
        Toast.makeText(this, "Click Button", Toast.LENGTH_SHORT).show();
        button1.setTextColor(Color.BLUE);

    }
}
