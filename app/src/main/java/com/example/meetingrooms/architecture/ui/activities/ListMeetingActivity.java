package com.example.meetingrooms.architecture.ui.activities;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.ui.activities.base.BaseActivity;
import com.example.meetingrooms.architecture.ui.events.DeleteMeetingEvent;
import com.example.meetingrooms.architecture.ui.recyclerView.adapters.MeetingAdapter;
import com.example.meetingrooms.architecture.ui.viewModel.MeetingListViewModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ListMeetingActivity extends BaseActivity {

    @Inject
    MeetingListViewModel listMeetingViewHolder;

    @BindView(R.id.list_meeting)
    RecyclerView recyclerView;
    private SearchView searchView;
    private MeetingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // filter recycler view when query submitted
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                // filter recycler view when text is changed
                adapter.getFilter().filter(query);
                return false;
            }
        });

        return true;
    }

    @Override
    public void onBackPressed() {
        // close search view on back button pressed
        if (!searchView.isIconified()) {
            searchView.setIconified(true);
            return;
        }
        super.onBackPressed();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    @Override
    public int getLayoutContentViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onResume() {
        super.onResume();
        initList();
    }

    private void initList() {
        adapter = new MeetingAdapter(listMeetingViewHolder.getMeeting());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @OnClick(R.id.add_meeting)
    void addNewMeeting() {
        Intent intent = new Intent(getApplicationContext(), NewMeetingActivity.class);
        startActivity(intent);
    }

    @Subscribe
    public void onDeleteMeeting(DeleteMeetingEvent deleteMeetingEvent) {
        listMeetingViewHolder.deleteMeeting(deleteMeetingEvent.meeting);
        initList();
    }
}