package com.thuo.nexthome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main15Activity extends AppCompatActivity {
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        btn2=(Button)findViewById(R.id.button29);
        btn2.setOnClickListener(new View.OnClickListener() {
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
