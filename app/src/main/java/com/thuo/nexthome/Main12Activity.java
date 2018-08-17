package com.thuo.nexthome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main12Activity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        btn1=(Button)findViewById(R.id.button26);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone="0711471437";
                //intents enable you to perform an activity
                Intent afte=new Intent(Intent.ACTION_DIAL, Uri.fromParts(
                        "tel",phone,null));
                startActivity(afte);
            }
        });
    }
}
