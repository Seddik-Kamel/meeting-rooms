package com.example.meetingrooms.recyclerView.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MeetingViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.textView)
    public TextView textView;

    public MeetingViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}
