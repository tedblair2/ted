package com.thuo.nexthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //A thread refers to one or more processes running concurrently at the same time
        Thread background=new Thread(){
            public void run() {
                try {
                    sleep((3*1000));
                    //Intents enable you to move from one page to another
                    Intent jj=new Intent(MainActivity.this,Rent.class);
                    startActivity(jj);
                    finish();
                }catch (Exception e){

                }
            }
        };
        background.start();
    }
}
