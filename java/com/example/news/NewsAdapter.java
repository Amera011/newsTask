package com.example.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class NewsAdapter extends BaseAdapter {

    List<newsObj>list;
    Context context;

public NewsAdapter(Context context, List<newsObj>list){
    this.list=list;
    this.context=context;
}

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public newsObj getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    viewholder holder;
    if (view==null){
        LayoutInflater inflate =LayoutInflater.from(context);
        view = inflate.inflate(R.layout.newslayout,viewGroup,false);
      holder = new viewholder(view);
      view.setTag(holder);

    }
    else {
holder = (viewholder)view .getTag();
    }
newsObj news  = getItem(i);
    holder.imageView.setImageResource(news.getImage());
    holder.t1.setText(news.getTitle());
    holder.t2.setText(news.getDetails());




        return view ;
    }
public   class viewholder{
ImageView imageView;
TextView t1;
TextView t2;
public viewholder(View v){
    imageView = v. findViewById(R.id.newsImage);
    t1=v.findViewById(R.id.title);
    t2=v.findViewById(R.id.details);

}
    }
}
