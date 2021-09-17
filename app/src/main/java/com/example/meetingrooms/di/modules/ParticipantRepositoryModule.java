package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.architecture.infrastructure.repository.ParticipantRepositoryImpl;
import com.example.meetingrooms.architecture.infrastructure.repository.ParticipantRepositoryService;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public abstract class ParticipantRepositoryModule {

    @Binds
    abstract ParticipantRepositoryService provideParticipantService(ParticipantRepositoryImpl participantRepository);
}
