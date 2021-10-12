package com.aisoftware.allbanglanewspaper.Newspaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;


import com.aisoftware.allbanglanewspaper.R;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    NewsAdapter newsAdapter;
    ArrayList<News_model> news_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerView=findViewById(R.id.newsRecyclerId);






        news_list=new ArrayList<>();
        news_list.add(new News_model("https://www.prothomalo.com/",R.drawable.prothomalo));
        news_list.add(new News_model("http://www.dainikshiksha.com/",R.drawable.sikha));
        news_list.add(new News_model("https://samakal.com/",R.drawable.somokal));
        news_list.add(new News_model("http://www.jaijaidinbd.com/",R.drawable.jayjaydin));
        news_list.add(new News_model("http://www.dainikamadershomoy.com/",R.drawable.amader_somoy));
        news_list.add(new News_model("https://www.dailynayadiganta.com/",R.drawable.noyadigonto));
        news_list.add(new News_model("http://www.kalerkantho.com/",R.drawable.kalerkontho));
        news_list.add(new News_model("https://www.bd-pratidin.com/",R.drawable.bangladesh_protidin));
        news_list.add(new News_model("https://www.dailyinqilab.com/",R.drawable.inqilab));
        news_list.add(new News_model("http://www.ittefaq.com.bd/",R.drawable.ittefaq));


        LinearLayoutManager layoutManager=new GridLayoutManager(this,2);
        newsAdapter=new NewsAdapter(getApplicationContext(),news_list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(newsAdapter);
    }
}