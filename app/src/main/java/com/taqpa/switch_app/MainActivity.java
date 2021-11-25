package com.taqpa.switch_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch switch1, switch2, switch3;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1=(Switch) findViewById(R.id.switch1);
        switch2=(Switch) findViewById(R.id.switch2);
        switch3=(Switch) findViewById(R.id.switch3);
        btn=(Button) findViewById(R.id.Submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Status1, Status2, Status3;


                if (switch1.isChecked()){
                    Status1=switch1.getTextOn().toString();

//                    Toast.makeText(getApplicationContext(), "On", Toast.LENGTH_SHORT).show();
                }else {
                    Status1=switch1.getTextOff().toString();
//                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                }
                if(switch2.isChecked()){
                    Status2=switch2.getTextOn().toString();

//                    Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
                }else{
                    Status2=switch2.getTextOff().toString();
//                    Toast.makeText(getApplicationContext(), "off", Toast.LENGTH_SHORT).show();
                }
                if(switch3.isChecked()){
                    Status3=switch3.getTextOn().toString();
//                    Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();

                }else {
                    Status3=switch3.getTextOff().toString();
//                    Toast.makeText(getApplicationContext(), "off", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(getApplicationContext(), "Status1" + Status2 + Status3 + "\n", Toast.LENGTH_SHORT).show();
            }


        });


    }
}