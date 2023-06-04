package com.androidlearning.practice_9;

import android.content.Context;
import android.graphics.ColorSpace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>
{
    private Context context;
    private ArrayList<Group> groups;

    public RecyclerViewAdapter(final Context context, final ArrayList<Group> groupList)
    {
        this.context = context;
        this.groups = groupList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Group group = groups.get(position);
        holder.groupNameTV.setText(group.getGroupName());
        holder.imageView.setImageResource(group.getImageResourceID());
        holder.imageView.setOnClickListener(group.getOnClickListener());
    }

    @Override
    public int getItemCount()
    {
        return groups.size();
    }
}
