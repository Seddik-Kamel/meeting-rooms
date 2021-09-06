package com.example.meetingrooms.recyclerView.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.model.Participant;
import com.example.meetingrooms.recyclerView.viewHolders.ParticipantsViewHolder;

import java.util.List;

public class ParticipantsAdapter extends RecyclerView.Adapter<ParticipantsViewHolder> {

    final List<Participant> participantList;

    public ParticipantsAdapter(List<Participant> participantList) {
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
