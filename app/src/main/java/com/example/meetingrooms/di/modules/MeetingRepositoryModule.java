package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryImpl;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public abstract class MeetingRepositoryModule {

    @Binds
    abstract MeetingRepositoryService provideRepositoryService(MeetingRepositoryImpl meetingRepository);
}
