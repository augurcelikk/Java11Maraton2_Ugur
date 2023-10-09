package com.ugur.service;

import com.ugur.repository.TimelineRepository;

public class TimelineService {
    TimelineRepository timelineRepository;

    public TimelineService() {
        this.timelineRepository= new TimelineRepository();
    }
}
