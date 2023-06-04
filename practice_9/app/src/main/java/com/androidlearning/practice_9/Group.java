package com.androidlearning.practice_9;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Group
{
    private Context context;
    private String groupName;
    private int imageResourceID;
    private View.OnClickListener onClickListener;

    public Group(Context context, String groupName, int imageResourceID)
    {
        this.context = context;
        this.groupName = groupName;
        this.imageResourceID = imageResourceID;
        onClickListener = view -> {
            Toast.makeText(context, groupName, Toast.LENGTH_SHORT).show();
            Log.i("dfdf", "sdfsdf");

            DetailViewActivity.info = groupName;
            Intent intent = new Intent(context, DetailViewActivity.class);
            context.startActivity(intent);
        };
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }
    public String getGroupName()
    {
        return groupName;
    }

    public void setImageResourceID(int imageResourceID)
    {
        this.imageResourceID = imageResourceID;
    }
    public int getImageResourceID()
    {
        return imageResourceID;
    }

    public View.OnClickListener getOnClickListener()
    {
        return onClickListener;
    }
}
