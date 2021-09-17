package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.domainService.MeetingDomainService;
import com.example.meetingrooms.domainService.MeetingDomainServiceImpl;

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
    abstract MeetingDomainService provideMeetingService(MeetingDomainServiceImpl dummyMeetingApiService);
}
