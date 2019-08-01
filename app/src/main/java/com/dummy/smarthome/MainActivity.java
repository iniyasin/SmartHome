package com.dummy.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton lamp1;
    private ImageButton lamp2;
    private ImageButton lamp3;
    private ImageButton fan;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lamp1 = (ImageButton) findViewById(R.id.lamp1);
        lamp1.setBackgroundResource(R.drawable.lamp1);
        lamp2 = (ImageButton) findViewById(R.id.lamp2);
        lamp2.setBackgroundResource(R.drawable.lamp2);
        lamp3 = (ImageButton) findViewById(R.id.lamp3);
        lamp3.setBackgroundResource(R.drawable.lamp3);
        fan = (ImageButton) findViewById(R.id.fan);
        fan.setBackgroundResource(R.drawable.fan);

        lamp1.setOnClickListener(this);
        lamp2.setOnClickListener(this);
        lamp3.setOnClickListener(this);
        fan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lamp1:
                if (flag == 0) {
                    flag = 1;
                    lamp1.setBackgroundResource(R.drawable.lamp1_off);
                } else {
                    flag = 0;
                    lamp1.setBackgroundResource(R.drawable.lamp1);
                }
                break;
            case R.id.lamp2:
                if (flag == 0) {
                    flag = 1;
                    lamp2.setBackgroundResource(R.drawable.lamp2_off);
                } else {
                    flag = 0;
                    lamp2.setBackgroundResource(R.drawable.lamp2);
                }
                break;
            case R.id.lamp3:
                if (flag == 0) {
                    flag = 1;
                    lamp3.setBackgroundResource(R.drawable.lamp3_off);
                } else {
                    flag = 0;
                    lamp3.setBackgroundResource(R.drawable.lamp3);
                }
                break;
            case R.id.fan:
                if (flag == 0) {
                    flag = 1;
                    fan.setBackgroundResource(R.drawable.fan_off);
                } else {
                    flag = 0;
                    fan.setBackgroundResource(R.drawable.fan);
                }
                break;
            default:
                break;
        }
    }
}
