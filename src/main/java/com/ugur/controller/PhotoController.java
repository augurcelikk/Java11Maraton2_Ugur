package com.ugur.controller;

import com.ugur.service.PhotoService;

public class PhotoController {
    PhotoService photoService;

    public PhotoController() {
        this.photoService=new PhotoService();
    }
}
