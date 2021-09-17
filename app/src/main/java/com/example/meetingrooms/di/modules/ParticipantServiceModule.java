package com.example.meetingrooms.di.modules;

import com.example.meetingrooms.applicationservices.ParticipantService;
import com.example.meetingrooms.applicationservices.ParticipantServiceImpl;
import com.example.meetingrooms.domainService.ParticipantDomainService;
import com.example.meetingrooms.domainService.ParticipantDomainServiceImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public abstract class ParticipantServiceModule {

    @Binds
    abstract ParticipantDomainService provideParticipantDomainService(ParticipantDomainServiceImpl participantService);

    @Binds
    abstract ParticipantService provideParticipantService(ParticipantServiceImpl participantService);
}
