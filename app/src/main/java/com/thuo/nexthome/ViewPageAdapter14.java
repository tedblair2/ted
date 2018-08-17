package com.thuo.nexthome;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by emobilis on 8/10/18.
 */

public class ViewPageAdapter14 extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[]images={R.drawable.ta,R.drawable.tb,R.drawable.tc,R.drawable.td,
            R.drawable.te,R.drawable.tf,R.drawable.tg};

    public ViewPageAdapter14(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_layout3,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView4);
        imageView.setImageResource(images[position]);

        ViewPager vp=(ViewPager)container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp=(ViewPager)container;
        View view=(View)object;
        vp.removeView(view);
    }
}
