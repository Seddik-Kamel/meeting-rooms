package com.example.meetingrooms.recyclerView.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.events.DeleteMeetingEvent;
import com.example.meetingrooms.model.Meeting;
import com.example.meetingrooms.recyclerView.viewHolders.MeetingViewHolder;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

public class MeetingAdapter extends RecyclerView.Adapter<MeetingViewHolder> {

    private final List<Meeting> meetingList;

    public MeetingAdapter(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    @NonNull
    @Override
    public MeetingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_recycler_view, parent, false);

        return new MeetingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetingViewHolder holder, int position) {
        Meeting meeting = meetingList.get(position);
        StringBuilder participantEmail = new StringBuilder();

        for (int i = 0; i < meeting.getParticipants().size(); i++) {
            participantEmail.append(meeting.getParticipants().get(i).getMails()).append(", ");
        }

        String stringBuilder = meeting.getPlace() +
                "-" +
                meeting.getHour() +
                "-" +
                meeting.getSubject();

        holder.itemInfo.setText(stringBuilder);
        holder.participantEmail.setText(participantEmail.toString());

        holder.itemImageMeeting.setImageResource(meeting.getResource());

        holder.deleteMeeting.setOnClickListener(v -> {
            EventBus.getDefault().post( new DeleteMeetingEvent(meeting));
        });
    }

    @Override
    public int getItemCount() {
        return meetingList.size();
    }

}
