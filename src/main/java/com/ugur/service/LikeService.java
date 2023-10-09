package com.ugur.service;

import com.ugur.repository.LikeRepository;
import com.ugur.repository.entity.Like;

public class LikeService {
    LikeRepository likeRepository;

    public LikeService() {
        this.likeRepository=new LikeRepository();
    }


    public Like save(Like like) {
        return likeRepository.save(like);
    }


}
