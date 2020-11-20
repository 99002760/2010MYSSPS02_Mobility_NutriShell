package com.example.nutrishell.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutrishell.DetailsActivity;
import com.example.nutrishell.HomeActivity;
import com.example.nutrishell.R;
import com.example.nutrishell.RecyclerData;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    RecyclerData[] recyclerData;
    Context context;

    public RecycleViewAdapter(RecyclerData[] myMovieData, HomeActivity activity) {
        this.recyclerData = myMovieData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RecyclerData recyclerDataList = recyclerData[position];
        holder.textViewName.setText(recyclerDataList.getItemName());
        holder.movieImage.setImageResource(recyclerDataList.getItemImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, recyclerDataList.getItemName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("position", recyclerDataList.getItemId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recyclerData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewName;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            
        }
    }

}