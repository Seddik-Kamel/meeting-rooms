package com.example.meetingrooms.architecture.ui.recyclerView.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.architecture.ui.events.DeleteMeetingEvent;
import com.example.meetingrooms.architecture.ui.recyclerView.viewHolders.MeetingViewHolder;
import com.example.meetingrooms.architecture.ui.viewModel.ParticipantListViewModel;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

public class MeetingAdapter extends RecyclerView.Adapter<MeetingViewHolder> implements Filterable {

    @Inject
    ParticipantListViewModel participantListViewModel;

    private final List<MeetingModel> meetingList;
    private List<MeetingModel> meetingFiltered;

    public MeetingAdapter(List<MeetingModel> meetingList) {
        this.meetingList = meetingList;
        this.meetingFiltered = meetingList;
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
        MeetingModel meeting = meetingFiltered.get(position);
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

        holder.deleteMeeting.setOnClickListener(v -> EventBus.getDefault().post(new DeleteMeetingEvent(meeting)));
    }

    @Override
    public int getItemCount() {
        return meetingFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    meetingFiltered = meetingList;
                } else {
                    List<MeetingModel> filteredList = new ArrayList<>();

                    for (MeetingModel row : meetingList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getHour().toLowerCase().contains(charString.toLowerCase()) || row.getPlace().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    meetingFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = meetingFiltered;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                meetingFiltered = (ArrayList<MeetingModel>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}
