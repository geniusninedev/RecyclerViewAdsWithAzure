package com.nineinfosys.android.recyclerviewadswithazure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.clockbyte.admobadapter.ViewWrapper;

import java.util.ArrayList;

/**
 * Created by Dev on 02-03-2017.
 */

public class ContentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<MarathiJokesContent> items = new ArrayList<>();
    private Context context;

    public ContentAdapter(Context context, ArrayList<MarathiJokesContent> items){
        this.items = items;
        this.context = context;


    }

    @Override
    public ViewWrapper<ContentHolder> onCreateViewHolder(ViewGroup parent, int viewType){
        return new ViewWrapper<ContentHolder>(new ContentHolder(context));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){
        ContentHolder contentHolder = (ContentHolder)viewHolder.itemView;
        MarathiJokesContent item = items.get(position);
        contentHolder.bind(item.getContent());
    }
    @Override
    public int getItemCount(){
        return  items.size();
    }


}
