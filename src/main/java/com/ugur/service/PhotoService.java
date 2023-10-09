package com.ugur.service;

import com.ugur.repository.PhotoRepository;

public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService() {
        this.photoRepository=new PhotoRepository();
    }
}
