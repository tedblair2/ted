package com.thuo.nexthome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by emobilis on 8/13/18.
 */

public class CustomAdapter extends ArrayAdapter<Custom> {
    Context cmtx;
    int resource;
    List<Custom>listitems;


    public CustomAdapter(@NonNull Context cmtx, int resource,List<Custom>listitems) {
        super(cmtx, resource,listitems);
        this.cmtx=cmtx;
        this.resource=resource;
        this.listitems=listitems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(cmtx);
        View view = inflater.inflate(R.layout.ted, null);
        TextView jina = view.findViewById(R.id.textView58);
        TextView location = view.findViewById(R.id.textView59);
        ImageView image = view.findViewById(R.id.imageView12);
        Button btnContact = view.findViewById(R.id.button22);


         final Custom custom = listitems.get(position);
        jina.setText(custom.getJina());
        location.setText(custom.getLocation());
        image.setImageDrawable(cmtx.getResources().getDrawable(custom.getImage()));
//        view.findViewById(R.id.button22);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",custom.getPhonenumber(),null));
                cmtx.startActivity(call);
            }
        });
        return view;

    }
}
