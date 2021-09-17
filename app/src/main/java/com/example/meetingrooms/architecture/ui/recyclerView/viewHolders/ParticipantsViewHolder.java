package com.example.meetingrooms.architecture.ui.recyclerView.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ParticipantsViewHolder  extends RecyclerView.ViewHolder {

    @BindView(R.id.participant_email)
    public TextView email;

    public ParticipantsViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }
}