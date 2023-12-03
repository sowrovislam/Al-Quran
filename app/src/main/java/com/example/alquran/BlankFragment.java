package com.example.alquran;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BlankFragment extends Fragment {


  ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
  HashMap<String,String>hashMap;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myview=inflater.inflate(R.layout.fragment_blank, container, false);

             RecyclerView recyclerView;

           recyclerView=myview.findViewById(R.id.recyclerView);


         //           <<<<<<<<<<<<<<<< Hassmap Cal>>>>>>>>>>


            MyHasmap();

        //           <<<<<<<<<<<<<<<< Hassmap Cal>>>>>>>>>>







        //           <<<<<<<<<<<<<<<<  MYadapter call Start  >>>>>>>>>>



        Myadapter myadapter=new Myadapter();
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        //           <<<<<<<<<<<<<<<<  MYadapte END   >>>>>>>>>>


        return myview;
    }



    // >>>>>>>>>>>>>>>>>> RecyclerView  create  Start >>>>>>>>>>>>>>>>>



    private class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHoldar>{


        private class ViewHoldar extends RecyclerView.ViewHolder{

             TextView tittle1,tittle2,tittle3;

             CardView cardView;
            public ViewHoldar(@NonNull View itemView) {
                super(itemView);

                tittle1=itemView.findViewById(R.id.tittle1);
                tittle2=itemView.findViewById(R.id.tittle2);
                tittle3=itemView.findViewById(R.id.tittle3);

                //
                cardView=itemView.findViewById(R.id.cardview);

            }
        }


        @NonNull
        @Override
        public ViewHoldar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater=getLayoutInflater();
            View Myview=layoutInflater.inflate(R.layout.itemlayout,parent,false);



            return new ViewHoldar(Myview);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHoldar holder, int position) {



            hashMap=arrayList.get(position);

            String name=hashMap.get("name");
            String arabic=hashMap.get("arabic");


            String dis1=hashMap.get("dis1");

            String dis2=hashMap.get("dis2");

            String dis3=hashMap.get("dis3");

            String dis4=hashMap.get("dis4");








            holder.tittle1.setText(name);

            holder.tittle3.setText(arabic);

            holder.tittle2.setText("" + position);






            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {






                    // >>>>>>>>>>   Fragment >>>>>>>>>>>>>>>>>>>>>>>>


                    Fragment fragment=new BlankFragment();
                    FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.framlayout,new BlankFragment2());
                    fragmentTransaction.addToBackStack("fragment");
                    fragmentTransaction.commit();

                    BlankFragment2.BANGLA=name;
                    BlankFragment2.ARABIC=arabic;

                    BlankFragment2.NEXTDIS=dis1;


                    BlankFragment2.NEXTDIS1=dis2;

                    BlankFragment2.NEXTDIS2=dis3;

                    BlankFragment2.NEXTDIS3=dis4;


                    // >>>>>>>>>>   Fragment  END >>>>>>>>>>>>>>>>>>>>>>>>







                }
            });





        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }



        // >>>>>>>>>>>>>>>>>> RecyclerView  create END >>>>>>>>>>>>>>>>>





    }





    private void MyHasmap(){

        hashMap=new HashMap<>();
        hashMap.put("name","আল ফাতিহা");
        hashMap.put("arabic","الفاتحة");
        hashMap.put("dis1"," \uFEFFبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ\n" +
                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                "\n" +
                "1:2 الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ\n" +
                "যাবতীয় প্রশংসা আল্লাহ তাআলার যিনি সকল সৃষ্টি জগতের পালনকর্তা।\n" +
                "\n" +
                "1:3 الرَّحْمَٰنِ الرَّحِيمِ\n" +
                "যিনি নিতান্ত মেহেরবান ও দয়ালু।\n" +
                "\n" +
                "1:4 مَالِكِ يَوْمِ الدِّينِ\n" +
                "যিনি বিচার দিনের মালিক।\n" +
                "\n" +
                "1:5 إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ\n" +
                "আমরা একমাত্র তোমারই ইবাদত করি এবং শুধুমাত্র তোমারই সাহায্য প্রার্থনা করি।\n" +
                "\n" +
                "1:6 اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ\n" +
                "আমাদেরকে সরল পথ দেখাও,\n" +
                "\n" +
                "1:7 صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ\n" +
                "সে সমস্ত লোকের পথ, যাদেরকে তুমি নেয়ামত দান করেছ। তাদের পথ নয়, যাদের প্রতি তোমার গজব নাযিল হয়েছে এবং যারা পথভ্রষ্ট হয়েছে।");

        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল বাক্বারাহ্");
        hashMap.put("arabic","البقرة");


        hashMap.put("dis1","  1");


        hashMap.put("dis2","  ");

        hashMap.put("dis3","  ");

        hashMap.put("dis4"," ");





        arrayList.add(hashMap);



//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল ইমরান");
        hashMap.put("arabic","آل عمران");

        hashMap.put("dis1","  ");

        hashMap.put("dis2","  ");

        hashMap.put("dis3","  ");

        hashMap.put("dis4"," ");





        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নিসা");
        hashMap.put("arabic","النّساء");
        hashMap.put("dis2","");


        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল মায়িদাহ");
        hashMap.put("arabic","المآئدة");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-আন‘আম");
        hashMap.put("arabic","الانعام");
        hashMap.put("dis2","");

        arrayList.add(hashMap);





//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল আরাফ");
        hashMap.put("arabic","الأعراف");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল আনফাল");
        hashMap.put("arabic","الأنفال");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তাওবাহ্");
        hashMap.put("arabic","التوبة");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ইউনুস");
        hashMap.put("arabic","يونس");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","হুদ");
        hashMap.put("arabic","هود");
        hashMap.put("dis2","");

        arrayList.add(hashMap);




//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ইউসুফ");
        hashMap.put("arabic","يوسف");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আর-রাদ");
        hashMap.put("arabic","الرّعد");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ইব্রাহীম");
        hashMap.put("arabic","إبراهيم");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name"," আল হিজর");
        hashMap.put("arabic","الحجر");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন নাহল");
        hashMap.put("arabic","النّحل");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","বনী-ইসরাঈল");
        hashMap.put("arabic","الإسرا");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল কাহফ");
        hashMap.put("arabic","الكهف");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","মারইয়াম");
        hashMap.put("arabic","مريم");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ত্বা-হা");
        hashMap.put("arabic","طه");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল আম্বিয়া");
        hashMap.put("arabic","الأنبياء");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল হাজ্জ্ব");
        hashMap.put("arabic","الحجّ");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল মু'মিনূন");
        hashMap.put("arabic","المؤمنون");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন নূর");
        hashMap.put("arabic","النّور");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল ফুরকান");
        hashMap.put("arabic","الفرقان");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আশ শুআরা");
        hashMap.put("arabic","الشّعراء");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নামল");
        hashMap.put("arabic","النّمل");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>



        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বাসাস");
        hashMap.put("arabic","القصص");
        hashMap.put("dis2","");

        arrayList.add(hashMap);



//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-‘আনকাবূত");
        hashMap.put("arabic","العنكبوت");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আর-রূম");
        hashMap.put("arabic","الرّوم");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","লুক্বমান");
        hashMap.put("arabic","لقمان");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আস সেজদাহ্");
        hashMap.put("arabic","السّجدة");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name"," আল আহযাব");
        hashMap.put("arabic","الْأحزاب");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","সাবা");
        hashMap.put("arabic","سبا");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ফাতির");
        hashMap.put("arabic","فاطر");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ইয়াসীন");
        hashMap.put("arabic","يس");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name"," আস-সাফফাত");
        hashMap.put("arabic","الصّافات");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ছোয়াদ");
        hashMap.put("arabic","ص");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-যুমার");
        hashMap.put("arabic","الزّمر");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","গাফের");
        hashMap.put("arabic","غافر");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ফুসসিলাত");
        hashMap.put("arabic","فصّلت");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আশ-শুরা");
        hashMap.put("arabic","الشّورى");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আয-যুখরুফ");
        hashMap.put("arabic","الزّخرف");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আদ-দুখান");
        hashMap.put("arabic","الدّخان");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-জাসিয়া");
        hashMap.put("arabic","الجاثية");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল আহক্বাফ");
        hashMap.put("arabic","الأحقاف");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name"," মুহাম্মদ");
        hashMap.put("arabic","محمّد");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল ফাতহ");
        hashMap.put("arabic","الفتح");
        hashMap.put("dis2","");

        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল হুজরাত");
        hashMap.put("arabic","الحجرات");
        hashMap.put("dis2","");

        arrayList.add(hashMap);

//        >>>>>>>>>>>>
        hashMap=new HashMap<>();
        hashMap.put("name","সুরত ক্বাফ");
        hashMap.put("arabic","ق");
        hashMap.put("dis2","");
        arrayList.add(hashMap);
//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আয-যারিয়াত ");
        hashMap.put("arabic","الذّاريات");
        hashMap.put("dis2","");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তূর");
        hashMap.put("arabic","الطّور");
        hashMap.put("dis","");
        arrayList.add(hashMap);





//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নাজম");
        hashMap.put("dis","");
        hashMap.put("arabic","النّجْم");
        arrayList.add(hashMap);




//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বামার");
        hashMap.put("dis","");
        hashMap.put("arabic","القمر");
        arrayList.add(hashMap);




//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আর-রাহমান");
        hashMap.put("dis","الرّحْمن");
        hashMap.put("arabic","");
        arrayList.add(hashMap);




//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ওয়াক্বি‘আহ");
        hashMap.put("dis","");
        hashMap.put("arabic","الواقعة");
        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-হাদীদ");
        hashMap.put("dis","");
        hashMap.put("arabic","الحديد");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুজাদালাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","المجادلة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-হাশর");
        hashMap.put("dis","");
        hashMap.put("arabic","الحشْر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুমতাহিনা");
        hashMap.put("dis","");
        hashMap.put("arabic","الممتحنة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আস-সাফ");
        hashMap.put("dis","");
        hashMap.put("arabic","الصّفّ");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-জুমু‘আ");
        hashMap.put("dis","");
        hashMap.put("arabic","الجمعة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুনাফিক্বূন");
        hashMap.put("dis","");
        hashMap.put("arabic","المنافقون");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তাগাবুন");
        hashMap.put("dis","");
        hashMap.put("arabic","التّغابن");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-ত্বালাক");
        hashMap.put("dis","");
        hashMap.put("arabic","الطّلاق");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তাহরীম");
        hashMap.put("dis","");
        hashMap.put("arabic","التّحريم");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুলক");
        hashMap.put("dis","");
        hashMap.put("arabic","الملك");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বালাম");
        hashMap.put("dis","");
        hashMap.put("arabic","القلم");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-হাক্কাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","الحآقّة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মা‘আরেজ");
        hashMap.put("dis","");
        hashMap.put("arabic","المعارج");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","নূহ");
        hashMap.put("dis","");
        hashMap.put("arabic","نوح");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-জিন্ন");
        hashMap.put("dis","");
        hashMap.put("arabic","الجنّ");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুযযাম্মিল");
        hashMap.put("dis","");
        hashMap.put("arabic","المزّمّل");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুদ্দাস্সির");
        hashMap.put("dis","");
        hashMap.put("arabic","المدّشّر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বিয়ামাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","القيامة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ইনসান");
        hashMap.put("dis","");
        hashMap.put("arabic","الدَّهْرِ");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুরসালাত");
        hashMap.put("dis","");
        hashMap.put("arabic","المرسلت");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নাবা");
        hashMap.put("dis","");
        hashMap.put("arabic","النّبا");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নাযি‘আত");
        hashMap.put("dis","");
        hashMap.put("arabic","النّزعت");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","‘আবাসা");
        hashMap.put("dis","");
        hashMap.put("arabic","عبس");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তাকভীর");
        hashMap.put("dis","");
        hashMap.put("arabic","التّكوير");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ইনফিতার");
        hashMap.put("dis","");
        hashMap.put("arabic","الانفطار");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মুতাফফিফীন");
        hashMap.put("dis","");
        hashMap.put("arabic","المطفّفين");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ইনশিক্বাক");
        hashMap.put("dis","");
        hashMap.put("arabic","الانشقاق");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-বুরূজ");
        hashMap.put("dis","");
        hashMap.put("arabic","البروج");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-ত্বারেক");
        hashMap.put("dis","");
        hashMap.put("arabic","الطّارق");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-আ‘লা");
        hashMap.put("dis","");
        hashMap.put("arabic","الأعلى");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-গাশিয়াহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","الغاشية");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ফাজর");
        hashMap.put("dis","");
        hashMap.put("arabic","الفجر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-বালাদ");
        hashMap.put("dis","");
        hashMap.put("arabic","البلد");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আশ-শামস");
        hashMap.put("dis","");
        hashMap.put("arabic","الشّمس");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-লাইল");
        hashMap.put("dis","");
        hashMap.put("arabic","الليل");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আদ্ব-দ্বুহা");
        hashMap.put("dis","");
        hashMap.put("arabic","الضحى");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আশ-শারহ");
        hashMap.put("dis","");
        hashMap.put("arabic","الشرح");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তীন");
        hashMap.put("dis","");
        hashMap.put("arabic","التين");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-‘আলাক্ব");
        hashMap.put("dis","");
        hashMap.put("arabic","العلق");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বাদর");
        hashMap.put("dis","");
        hashMap.put("arabic","القدر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-বায়্যিনাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","البينة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আয-যালযালাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","الزلزلة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-‘আদিয়াত");
        hashMap.put("dis","");
        hashMap.put("arabic","العاديات");

        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ক্বারি‘আহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","القارعة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আত-তাকাসুর");
        hashMap.put("dis","");
        hashMap.put("arabic","التكاثر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-‘আসর");
        hashMap.put("dis","");
        hashMap.put("arabic","العصر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-হুমাযাহ্");
        hashMap.put("dis","");
        hashMap.put("arabic","الهمزة");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ফীল");
        hashMap.put("dis","");
        hashMap.put("arabic","الفيل");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","ক্বুরাইশ");
        hashMap.put("dis","");
        hashMap.put("arabic","قريش");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মা‘ঊন");
        hashMap.put("dis","");
        hashMap.put("arabic","الماعون");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-কাউসার");
        hashMap.put("dis","");
        hashMap.put("arabic","الكوثر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-কাফিরূন");
        hashMap.put("dis","");
        hashMap.put("arabic","الكافرون");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নাসর");
        hashMap.put("dis","");
        hashMap.put("arabic","النصر");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-মাসাদ");
        hashMap.put("dis","");
        hashMap.put("arabic","المسد");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ইখলাস");
        hashMap.put("dis","");
        hashMap.put("arabic","الإخلاص");
        arrayList.add(hashMap);

//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আল-ফালাক্ব");
        hashMap.put("dis","");
        hashMap.put("arabic","الفلق");
        arrayList.add(hashMap);


//        >>>>>>>>>>>>

        hashMap=new HashMap<>();
        hashMap.put("name","আন-নাস");
        hashMap.put("dis","");
        hashMap.put("arabic","الناس");
        arrayList.add(hashMap);


    }





}