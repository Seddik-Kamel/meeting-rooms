package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.service.DummyMeetingApiService;
import com.example.meetingrooms.service.MeetingService;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public abstract class MeetingServiceModule {

    @Binds
    @Singleton
    abstract MeetingService provideMeetingService(DummyMeetingApiService dummyMeetingApiService);
}
