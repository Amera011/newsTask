package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class bookActivity extends AppCompatActivity {
ListView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        v = findViewById(R.id.bookListView);


        ArrayList<newsObj> news = new ArrayList<>();
        String titles[]={"sports","economy","social","religion","education","politics","health"};
        String details[]={"اي حاجه عن الرياضه", "اي حاجه عن الاقتصاد"," الدين","اي حاجه عن التعليم","اي حاجه عن الاقتصاد","الصحه"};
        int images [] ={R.drawable.news1,R.drawable.news3,R.drawable.news4,R.drawable.new5,R.drawable.new6,R.drawable.news7};



        for (int i = 0 ; i <titles.length;i++){
            newsObj x= new newsObj(titles[i],details[i],images[i]);
            news.add(x);

        }

        NewsAdapter adapter = new NewsAdapter(bookActivity.this,news);
        v.setAdapter(adapter);
    }
}
