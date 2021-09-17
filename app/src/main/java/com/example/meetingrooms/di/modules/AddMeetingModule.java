package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.architecture.applicationservices.AddMeetingService;
import com.example.meetingrooms.architecture.applicationservices.AddMeetingServiceImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public abstract class AddMeetingModule {

    @Binds
    abstract AddMeetingService provideAddMeetingService(AddMeetingServiceImpl addMeetingService);
}
