package com.example.meetingrooms.recyclerView.viewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MeetingViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.delete_meeting)
    public ImageButton deleteMeeting;

    @BindView(R.id.item_participtant_email)
    public TextView participantEmail;

    @BindView(R.id.item_info)
    public TextView itemInfo;

    @BindView(R.id.item_image_meeting)
    public ImageView itemImageMeeting;

    public MeetingViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
