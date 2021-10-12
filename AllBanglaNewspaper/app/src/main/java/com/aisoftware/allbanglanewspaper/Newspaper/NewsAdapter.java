package com.aisoftware.allbanglanewspaper.Newspaper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aisoftware.allbanglanewspaper.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{

    Context context;
    ArrayList<News_model> news_list;

    public NewsAdapter(Context context, ArrayList<News_model> news_list) {
        this.context = context;
        this.news_list = news_list;
    }

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.news_view,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {

        News_model news=news_list.get(position);
        final int image=news.getNewsImage();
        final String url=news.getNewsUrl();

        Picasso.get().load(image).into(holder.newsImage);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),WebActivity.class);
                intent.putExtra("myUrl",url);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return news_list.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView newsImage;
        LinearLayout linearLayout;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsImage=itemView.findViewById(R.id.imageViewId);
            linearLayout= itemView.findViewById(R.id.linearLayoutId);
        }
    }
}