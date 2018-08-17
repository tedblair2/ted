package com.thuo.nexthome;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Buy extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager9,viewPager10,viewPager11,viewPager12,viewPager13,viewPager14,viewPager15,viewPager16;
    LinearLayout sliderdotspanel9,sliderdotspanel10,sliderdotspanel11,sliderdotspanel12,sliderdotspanel13,
            sliderdotspanel14,sliderdotspanel15,sliderdotspanel16;
    private int dotscount9,dotscount10,dotscount11,dotscount12,dotscount13,dotscount14,dotscount15,dotscount16;
    private ImageView[]dots9,dots10,dots11,dots12,dots13,dots14,dots15,dots16;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        btn1=(Button)findViewById(R.id.button9);
        btn2=(Button)findViewById(R.id.button10);
        btn3=(Button)findViewById(R.id.button11);
        btn4=(Button)findViewById(R.id.button13);
        btn5=(Button)findViewById(R.id.button14);
        btn6=(Button)findViewById(R.id.button15);
        btn7=(Button)findViewById(R.id.button18);
        btn8=(Button)findViewById(R.id.button32);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy=new Intent(Buy.this,Main9Activity.class);
                startActivity(buy);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy2=new Intent(Buy.this,Main10Activity.class);
                startActivity(buy2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy3=new Intent(Buy.this,Main11Activity.class);
                startActivity(buy3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy4=new Intent(Buy.this,Main12Activity.class);
                startActivity(buy4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy5=new Intent(Buy.this,Main13Activity.class);
                startActivity(buy5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy6=new Intent(Buy.this,Main14Activity.class);
                startActivity(buy6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy7=new Intent(Buy.this,Main15Activity.class);
                startActivity(buy7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy8=new Intent(Buy.this,Main16Activity.class);
                startActivity(buy8);
            }
        });

        viewPager9=(ViewPager)findViewById(R.id.view9);
        sliderdotspanel9=(LinearLayout)findViewById(R.id.slidebars9);

        ViewPageAdapter9 viewPageAdapter9=new ViewPageAdapter9(this);

        viewPager9.setAdapter(viewPageAdapter9);

        dotscount9=viewPageAdapter9.getCount();
        dots9=new ImageView[dotscount9];

        for (int i=0;i<dotscount9;i++){
            dots9[i]=new ImageView(this);
            dots9[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel9.addView(dots9[i],params);
        }

        dots9[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager9.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount9;i++){
                    dots9[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots9[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager10=(ViewPager)findViewById(R.id.view10);
        sliderdotspanel10=(LinearLayout)findViewById(R.id.slidebars10);

        ViewPageAdapter10 viewPageAdapter10=new ViewPageAdapter10(this);

        viewPager10.setAdapter(viewPageAdapter10);

        dotscount10=viewPageAdapter10.getCount();
        dots10=new ImageView[dotscount10];

        for (int i=0;i<dotscount10;i++){
            dots10[i]=new ImageView(this);
            dots10[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel10.addView(dots10[i],params);
        }

        dots10[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager10.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount10;i++){
                    dots10[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots10[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager11=(ViewPager)findViewById(R.id.view11);
        sliderdotspanel11=(LinearLayout)findViewById(R.id.slidebars11);

        ViewPageAdapter11 viewPageAdapter11=new ViewPageAdapter11(this);

        viewPager11.setAdapter(viewPageAdapter11);

        dotscount11=viewPageAdapter11.getCount();
        dots11=new ImageView[dotscount11];

        for (int i=0;i<dotscount11;i++){
            dots11[i]=new ImageView(this);
            dots11[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel11.addView(dots11[i],params);
        }

        dots11[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager11.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount11;i++){
                    dots11[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots11[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager12=(ViewPager)findViewById(R.id.view12);
        sliderdotspanel12=(LinearLayout)findViewById(R.id.slidebars12);

        ViewPageAdapter12 viewPageAdapter12=new ViewPageAdapter12(this);

        viewPager12.setAdapter(viewPageAdapter12);

        dotscount12=viewPageAdapter12.getCount();
        dots12=new ImageView[dotscount12];

        for (int i=0;i<dotscount12;i++){
            dots12[i]=new ImageView(this);
            dots12[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel12.addView(dots12[i],params);
        }

        dots12[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager12.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount12;i++){
                    dots12[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots12[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager13=(ViewPager)findViewById(R.id.view13);
        sliderdotspanel13=(LinearLayout)findViewById(R.id.slidebars13);

        ViewPageAdapter13 viewPageAdapter13=new ViewPageAdapter13(this);

        viewPager13.setAdapter(viewPageAdapter13);

        dotscount13=viewPageAdapter13.getCount();
        dots13=new ImageView[dotscount13];

        for (int i=0;i<dotscount13;i++){
            dots13[i]=new ImageView(this);
            dots13[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel13.addView(dots13[i],params);
        }

        dots13[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager13.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount13;i++){
                    dots13[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots13[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager14=(ViewPager)findViewById(R.id.view14);
        sliderdotspanel14=(LinearLayout)findViewById(R.id.slidebars14);

        ViewPageAdapter14 viewPageAdapter14=new ViewPageAdapter14(this);

        viewPager14.setAdapter(viewPageAdapter14);

        dotscount14=viewPageAdapter14.getCount();
        dots14=new ImageView[dotscount14];

        for (int i=0;i<dotscount14;i++){
            dots14[i]=new ImageView(this);
            dots14[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel14.addView(dots14[i],params);
        }

        dots14[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager14.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount14;i++){
                    dots14[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots14[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager15=(ViewPager)findViewById(R.id.view15);
        sliderdotspanel15=(LinearLayout)findViewById(R.id.slidebars15);

        ViewPageAdapter15 viewPageAdapter15=new ViewPageAdapter15(this);

        viewPager15.setAdapter(viewPageAdapter15);

        dotscount15=viewPageAdapter15.getCount();
        dots15=new ImageView[dotscount15];

        for (int i=0;i<dotscount15;i++){
            dots15[i]=new ImageView(this);
            dots15[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel15.addView(dots15[i],params);
        }

        dots15[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager15.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount15;i++){
                    dots15[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots15[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager16=(ViewPager)findViewById(R.id.view16);
        sliderdotspanel16=(LinearLayout)findViewById(R.id.slidebars16);

        ViewPageAdapter16 viewPageAdapter16=new ViewPageAdapter16(this);

        viewPager16.setAdapter(viewPageAdapter16);

        dotscount16=viewPageAdapter16.getCount();
        dots16=new ImageView[dotscount16];

        for (int i=0;i<dotscount16;i++){
            dots16[i]=new ImageView(this);
            dots16[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel16.addView(dots16[i],params);
        }

        dots16[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager16.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount16;i++){
                    dots16[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots16[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.buy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent rent=new Intent(Buy.this,Rent.class);
            startActivity(rent);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

            Intent agent=new Intent(Buy.this,Agent.class);
            startActivity(agent);

        } else if (id == R.id.nav_location) {
            Intent find2=new Intent(Buy.this,FindUs.class);
            startActivity(find2);

        } else if (id == R.id.nav_share) {
            String phone="0711471437";
            //intents enable you to perform an activity
            Intent afte=new Intent(Intent.ACTION_DIAL, Uri.fromParts(
                    "tel",phone,null));
            startActivity(afte);

        } else if (id == R.id.nav_send) {
            Intent mail=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","ominoblair@gmail.com",null));
            mail.putExtra(Intent.EXTRA_SUBJECT,"");
            mail.putExtra(Intent.EXTRA_TEXT,"");
            startActivity(Intent.createChooser(mail,"Share mail via"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
