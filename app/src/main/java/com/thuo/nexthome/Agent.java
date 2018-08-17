package com.thuo.nexthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Agent extends AppCompatActivity {

    List<Custom> listitems;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);
        listitems=new ArrayList<>();
        listitems.add(new Custom(R.drawable.pa,"Home Afrika","Kiambu, Central","0776639748"));
        listitems.add(new Custom(R.drawable.pb,"SOUTH RIVER HOMES LTD","KINDARUMA RD, KILIMANI, NAIROBI, NAIROBI","0726917647"));
        listitems.add(new Custom(R.drawable.pc,"Property Reality Company","PRC Centre, David Oseli Road, Nairobi","0711471437"));
        listitems.add(new Custom(R.drawable.pd,"Mambo Properties","Soin Arcade 4th Floor, Westlands, Nairobi","0720404300"));
        listitems.add(new Custom(R.drawable.pf,"Coral Property International Ltd","Peponi Plaza, Block B0, Mwanzi Road","0776770145"));
        listitems.add(new Custom(R.drawable.ph,"Prince Capital Ltd","52051-00100, Nairobi","071234567"));
        listitems.add(new Custom(R.drawable.pg,"Axis Real Estate","Rahimtulla Tower, Nairobi","0789123456"));
        listitems.add(new Custom(R.drawable.pe,"Kings Developers","Saj Ceramics, 2nd Floor, Embakasi, Mombasa Road","0796754830"));
        listView=findViewById(R.id.listview);
        CustomAdapter adapter=new CustomAdapter(this,R.layout.ted,listitems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
/*                if (i==0){
                    //intents enable you to perform an activity
                    Intent afte=new Intent(Intent.ACTION_DIAL, Uri.fromParts(
                            "tel",phone,null));
                    startActivity(afte);
                */
//                }
            }
        });
    }
}
