package com.example.alquran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity2 extends AppCompatActivity {

    DrawerLayout drawerLayout;

    MaterialToolbar materialToolbar;

    FrameLayout frameLayout;

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        <<<<<<<<<<<<<<<<<<<< rotet mode off in this code ,,,,START>>>>>>>>>>>>>>>>>>>>>
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        <<<<<<<<<<<<<<<<<<<< rotet mode off in this code ,,,,END>>>>>>>>>>>>>>>>>>>>>



        drawerLayout=findViewById(R.id.drawerLayout);

        materialToolbar=findViewById(R.id.matrialtookbar);

        frameLayout=findViewById(R.id.framlayout);

        navigationView=findViewById(R.id.navigationView);


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framlayout,new BlankFragment());
        fragmentTransaction.commit();












        //<<<<<<<<<<<<<<<<< Drawer Layout ar kaj  ...START>>>>>>>>>>>>>>>>>>>

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainActivity2.this,drawerLayout,materialToolbar,R.string.Close_dawer,R.string.Open_Dawer);

                  drawerLayout.addDrawerListener(toggle);


        //<<<<<<<<<<<<<<<<< Drawer Layout ar kaj  ...END>>>>>>>>>>>>>>>>>>>











        //<<<<<<<<<<<<<< NavagationView ar kaj ....START>>>>>>>>>>>>>>


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){

                    drawerLayout.closeDrawer(GravityCompat.START);

                    Toast.makeText(MainActivity2.this, "ssss", Toast.LENGTH_SHORT).show();




                } else if (item.getItemId()==R.id.alarms) {



                } else if (item.getItemId()==R.id.update) {




                }else if (item.getItemId()==R.id.rating) {



                }else if (item.getItemId()==R.id.about) {



                }else if (item.getItemId()==R.id.policy) {
                    
                    



                }else if (item.getItemId()==R.id.exit) {

                    finishAffinity();



                }


                return true;
            }
        });






        //<<<<<<<<<<<<<< NavagationView ar kaj ....END>>>>>>>>>>>>>>






        //<<<<<<<<<<<<<< MaterialToolbar  ....START>>>>>>>>>>>>>>
        
        
        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                
                
                if (item.getItemId()==R.id.share){



                    
                    
                    
                } else if (item.getItemId()==R.id.sms) {





                    
                }


                return true;
            }
        });






        //<<<<<<<<<<<<<< MaterialToolbar  ....END>>>>>>>>>>>>>>
























    }



    @Override
    public void onBackPressed() {
       // super.onBackPressed();

        finishAffinity();
    }



}