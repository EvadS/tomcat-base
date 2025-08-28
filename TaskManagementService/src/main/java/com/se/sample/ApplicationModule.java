package com.se.sample;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.se.sample.repository.InMemoryTaskManagementRepository;
import com.se.sample.repository.TaskManagementRepository;

public class ApplicationModule extends AbstractModule {

    @Override
    public void configure() {
        bind(TaskManagementRepository.class)
                .to(InMemoryTaskManagementRepository.class).in(Singleton.class);
    }

}

