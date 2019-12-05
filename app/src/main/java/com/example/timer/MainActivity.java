package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int seconds;
    public void setSeconds(int value){
        this.seconds = value;
        upTimeView();
    }
    public void upTimeView (){
        int ss =seconds %60;
        int minutes = seconds /60;
        int mm = minutes%60;
        int hours = mm /60;
        String tStr = String.format("%02d:%02d:%02d", hours, mm, ss);
        TextView timeView = (TextView) findViewById(R.id.timer);
        timeView.setText(tStr);
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSeconds(0);
    }
    private CountDownTimer timer = new CountDownTimer(Long.MAX_VALUE, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            setSeconds(++seconds);
        }
        public void onFinish(){

        }


    };




    public void onClickstart(View view){
        timer.start();
        Button b = (Button)view;
        b.setEnabled(false);

    }

    public void onClickfinish(View view){
        timer.cancel();
        Button buttonf = (Button) findViewById(R.id.buttons);
        buttonf.setEnabled(true);

    }

    public void onClickreset(View view){
        timer.cancel();
        setSeconds(0);
        Button buttonr = (Button) findViewById(R.id.buttons);
        buttonr.setEnabled(true);
    }

}
