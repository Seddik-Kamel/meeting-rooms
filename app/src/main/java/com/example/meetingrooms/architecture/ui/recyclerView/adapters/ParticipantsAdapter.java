package com.example.meetingrooms.architecture.ui.recyclerView.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.model.ParticipantModel;
import com.example.meetingrooms.architecture.ui.recyclerView.viewHolders.ParticipantsViewHolder;

import java.util.List;

public class ParticipantsAdapter extends RecyclerView.Adapter<ParticipantsViewHolder> {

    final List<ParticipantModel> participantList;

    public ParticipantsAdapter(List<ParticipantModel> participantList) {
        this.participantList = participantList;
    }

    @NonNull
    @Override
    public ParticipantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_participants_recycler_view, parent, false);

        return new ParticipantsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParticipantsViewHolder holder, int position) {
        holder.email.setText(participantList.get(position).getMails());
    }

    @Override
    public int getItemCount() {
        return participantList.size();
    }
}
