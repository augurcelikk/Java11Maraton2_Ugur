package com.ugur.controller;

import com.ugur.repository.entity.Like;
import com.ugur.repository.entity.User;
import com.ugur.service.LikeService;
import static com.ugur.utility.Constants.*;

import java.util.Scanner;

public class LikeController {
    LikeService likeService;
    Scanner scanner;

    public LikeController() {
        this.likeService =new LikeService();
        this.scanner = new Scanner(System.in);
    }

    public Like begeniYap(User user) {

        Long userId=user.getId();
        Long postId = 0L;
        System.out.println("Begeni yapacaginiz postun Id'sini giriniz");
        postId = Long.parseLong(scanner.nextLine());

        Like like = Like.builder()
                .userId(userId)
                .postId(postId)
                .baseEntity(getBaseEntity())
                .build();
        return likeService.save(like);
    }

}
