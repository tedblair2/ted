package com.thuo.nexthome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=(Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
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
