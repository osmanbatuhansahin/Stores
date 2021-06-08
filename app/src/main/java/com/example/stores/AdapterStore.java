package com.example.stores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterStore extends RecyclerView.Adapter<AdapterStore.MyViewHolder> {

    Context context;

    ArrayList<Store> list;

    public AdapterStore(Context context, ArrayList<Store> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Store store = list.get(position);
        holder.storeName.setText(store.getstoreName());
        holder.peopleNum.setText(Integer.toString(store.getPeopleNum()));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView storeName, peopleNum;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            storeName = itemView.findViewById(R.id.tvStoreName);
            peopleNum = itemView.findViewById(R.id.tvPeople);

        }
    }

}
