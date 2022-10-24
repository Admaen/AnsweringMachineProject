package com.example.deveraansweringmachineala;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class InstanceAdapter extends RecyclerView.Adapter<InstanceAdapter.ViewHolder>{

    Context context;

    @NonNull
    @Override
    public InstanceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        LayoutInflater instanceInflater =   LayoutInflater.from(context);
        View view = instanceInflater.inflate(R.layout.am_instance, parent,false);


        return new InstanceAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }



    }
}
