package com.example.nutrishell.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutrishell.DetailsActivity;
import com.example.nutrishell.R;
import com.example.nutrishell.NutritionData;

public class NutritionViewAdapter extends RecyclerView.Adapter<NutritionViewAdapter.ViewHolder> {

    NutritionData[] nutritionData;
    Context context;

    public NutritionViewAdapter(NutritionData[] nutritionData, DetailsActivity activity) {
        this.nutritionData = nutritionData;
        this.context = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_method,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NutritionData nutritionDataList = nutritionData[position];
        holder.textViewData.setText(nutritionDataList.getData());


    }
    @Override
    public int getItemCount() {
        return nutritionData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewData;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewData = itemView.findViewById(R.id.cardMethod);

        }
    }

}