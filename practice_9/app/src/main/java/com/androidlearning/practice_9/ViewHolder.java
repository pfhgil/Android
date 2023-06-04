package com.androidlearning.practice_9;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder
{
    public TextView groupNameTV;
    public ImageView imageView;
    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        groupNameTV = itemView.findViewById(R.id.group_name);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
