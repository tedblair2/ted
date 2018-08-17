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

public class Rent extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager,viewPager2,viewPager3,viewPager4,viewPager5,viewPager6,viewPager7,viewPager8;
    LinearLayout sliderdotspanel,sliderdotspanel2,sliderdotspanel3,sliderdotspanel4,sliderdotspanel5,
    sliderdotspanel6,sliderdotspanel7,sliderdotspanel8;
    private int dotscount,dotscount2,dotscount3,dotscount4,dotscount5,dotscount6,dotscount7,dotscount8;
    private ImageView[]dots,dots2,dots3,dots4,dots5,dots6,dots7,dots8;
    private Button bar,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        bar=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button6);
        btn6=(Button)findViewById(R.id.button7);
        btn7=(Button)findViewById(R.id.button8);
        btn8=(Button)findViewById(R.id.button9);

        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(Rent.this,BarakaEstate.class);
                startActivity(home);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home2=new Intent(Rent.this,Main2Activity.class);
                startActivity(home2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home3=new Intent(Rent.this,Main3Activity.class);
                startActivity(home3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home4=new Intent(Rent.this,Main4Activity.class);
                startActivity(home4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home5=new Intent(Rent.this,Main5Activity.class);
                startActivity(home5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home6=new Intent(Rent.this,Main6Activity.class);
                startActivity(home6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home7=new Intent(Rent.this,Main7Activity.class);
                startActivity(home7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home8=new Intent(Rent.this,Main8Activity.class);
                startActivity(home8);
            }
        });

        viewPager=(ViewPager)findViewById(R.id.view);
        sliderdotspanel=(LinearLayout)findViewById(R.id.slidebars);

        ViewPageAdapter viewPageAdapter=new ViewPageAdapter(this);

        viewPager.setAdapter(viewPageAdapter);

        dotscount=viewPageAdapter.getCount();
        dots=new ImageView[dotscount];

        for (int i=0;i<dotscount;i++){
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel.addView(dots[i],params);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
         viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
             @Override
             public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

             }

             @Override
             public void onPageSelected(int position) {
                 for (int i=0;i<dotscount;i++){
                     dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                 }
                 dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

             }

             @Override
             public void onPageScrollStateChanged(int state) {

             }
         });

        viewPager2=(ViewPager)findViewById(R.id.view2);
        sliderdotspanel2=(LinearLayout)findViewById(R.id.slidebars2);

        ViewAdapter viewAdapter=new ViewAdapter(this);

        viewPager2.setAdapter(viewAdapter);

        dotscount2=viewAdapter.getCount();
        dots2=new ImageView[dotscount2];

        for (int i=0;i<dotscount2;i++){
            dots2[i]=new ImageView(this);
            dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel2.addView(dots2[i],params);
        }

        dots2[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount2;i++){
                    dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots2[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager3=(ViewPager)findViewById(R.id.view3);
        sliderdotspanel3=(LinearLayout)findViewById(R.id.slidebars3);

        ViewPageAdapter3 viewPageAdapter3=new ViewPageAdapter3(this);

        viewPager3.setAdapter(viewPageAdapter3);

        dotscount3=viewPageAdapter3.getCount();
        dots3=new ImageView[dotscount3];

        for (int i=0;i<dotscount3;i++){
            dots3[i]=new ImageView(this);
            dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel3.addView(dots3[i],params);
        }

        dots3[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount3;i++){
                    dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots3[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager4=(ViewPager)findViewById(R.id.view4);
        sliderdotspanel4=(LinearLayout)findViewById(R.id.slidebars4);

        ViewPageAdapter4 viewPageAdapter4=new ViewPageAdapter4(this);

        viewPager4.setAdapter(viewPageAdapter4);

        dotscount4=viewPageAdapter4.getCount();
        dots4=new ImageView[dotscount4];

        for (int i=0;i<dotscount4;i++){
            dots4[i]=new ImageView(this);
            dots4[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel4.addView(dots4[i],params);
        }

        dots4[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager4.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount4;i++){
                    dots4[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots4[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager5=(ViewPager)findViewById(R.id.view5);
        sliderdotspanel5=(LinearLayout)findViewById(R.id.slidebars5);

        ViewPageAdapter5 viewPageAdapter5=new ViewPageAdapter5(this);

        viewPager5.setAdapter(viewPageAdapter5);

        dotscount5=viewPageAdapter5.getCount();
        dots5=new ImageView[dotscount5];

        for (int i=0;i<dotscount5;i++){
            dots5[i]=new ImageView(this);
            dots5[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel5.addView(dots5[i],params);
        }

        dots5[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager5.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount5;i++){
                    dots5[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots5[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager6=(ViewPager)findViewById(R.id.view6);
        sliderdotspanel6=(LinearLayout)findViewById(R.id.slidebars6);

        ViewPageAdapter6 viewPageAdapter6=new ViewPageAdapter6(this);

        viewPager6.setAdapter(viewPageAdapter6);

        dotscount6=viewPageAdapter6.getCount();
        dots6=new ImageView[dotscount6];

        for (int i=0;i<dotscount6;i++){
            dots6[i]=new ImageView(this);
            dots6[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel6.addView(dots6[i],params);
        }

        dots6[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager6.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount6;i++){
                    dots6[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots6[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager7=(ViewPager)findViewById(R.id.view7);
        sliderdotspanel7=(LinearLayout)findViewById(R.id.slidebars7);

        ViewPageAdapter7 viewPageAdapter7=new ViewPageAdapter7(this);

        viewPager7.setAdapter(viewPageAdapter7);

        dotscount7=viewPageAdapter7.getCount();
        dots7=new ImageView[dotscount7];

        for (int i=0;i<dotscount7;i++){
            dots7[i]=new ImageView(this);
            dots7[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel7.addView(dots7[i],params);
        }

        dots7[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager7.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount7;i++){
                    dots7[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots7[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager8=(ViewPager)findViewById(R.id.view8);
        sliderdotspanel8=(LinearLayout)findViewById(R.id.slidebars8);

        ViewPageAdapter8 viewPageAdapter8=new ViewPageAdapter8(this);

        viewPager8.setAdapter(viewPageAdapter8);

        dotscount8=viewPageAdapter8.getCount();
        dots8=new ImageView[dotscount8];

        for (int i=0;i<dotscount8;i++){
            dots8[i]=new ImageView(this);
            dots8[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderdotspanel8.addView(dots8[i],params);
        }

        dots8[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager8.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<dotscount8;i++){
                    dots8[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }
                dots8[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

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
        // Inflate the menu; this adds items to the action b</RelativeLayout>ar if it is present.
        getMenuInflater().inflate(R.menu.rent, menu);
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
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent buy=new Intent(Rent.this,Buy.class);
            startActivity(buy);

        } else if (id == R.id.nav_slideshow) {
            Intent agent = new Intent(Rent.this, Agent.class);
            startActivity(agent);

        }else if(id ==R.id.nav_location){
            Intent find=new Intent(Rent.this,FindUs.class);
            startActivity(find);

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
