package com.example.hp.recycler;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by placement on 8/10/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    String[] countrynames, capitalnames;

    public RecyclerViewAdapter(String[] country_names, String[] capital_names) {
        this.countrynames = country_names;
        this.capitalnames = capital_names;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.countrynames.setText(countrynames[position]);
        holder.capitalnames.setText(capitalnames[position]);
    }


    @Override
    public int getItemCount() {
        return capitalnames.length;
        
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView countrynames,capitalnames;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            countrynames=(TextView)itemView.findViewById(R.id.country_id);
            capitalnames=(TextView)itemView.findViewById(R.id.capital_id);
        }
    }
        
    }
