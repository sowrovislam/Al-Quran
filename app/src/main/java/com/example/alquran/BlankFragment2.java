package com.example.alquran;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class BlankFragment2 extends Fragment {



    public static String BANGLA="";

    public static String ARABIC="";
    public static String NEXTDIS="";
    public static String NEXTDIS1="";
    public static String NEXTDIS2="";

    public static String NEXTDIS3="";

    public static String NEXTDIS4="";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_blank2, container, false);



        TextView nextpage1,nextpage2,nextdis,nextdis1,nexdis2,nextdis3,nextdis4;


        nextpage1=myView.findViewById(R.id.next1);
        nextpage2=myView.findViewById(R.id.next2);
        nextdis=myView.findViewById(R.id.nextdis);
        nextdis1=myView.findViewById(R.id.nextdis1);
        nexdis2=myView.findViewById(R.id.nextdis2);
        nextdis3=myView.findViewById(R.id.nextdis3);
        nextdis4=myView.findViewById(R.id.nextdis4);





        //>>>>>>>>>>> Data parsing>>>>>>>>>>>

                 nextpage1.setText(BANGLA);
                 nextpage2.setText(ARABIC);

                 nextdis.setText(NEXTDIS);

                 nextdis1.setText(NEXTDIS1);

                 nexdis2.setText(NEXTDIS2);

                 nextdis3.setText(NEXTDIS3);

                 nextdis4.setText(NEXTDIS4);








                 //>>>>>>>>>>> Data parsing>>>>>>END>>>>>




            //  <<<<<<<<<<<<<<<<<< Random color  Start>>>>>>>>>>>>>>>>>>>


                    Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

           nextpage2.setBackgroundColor(color);


        //  <<<<<<<<<<<<<<<<<< Random color  END>>>>>>>>>>>>>>>>>>>































        return myView;
    }




}