package com.ugur.controller;

import com.ugur.service.TimelineService;

public class TimelineController {
    TimelineService timelineService;

    public TimelineController() {
        this.timelineService= new TimelineService();
    }
}
