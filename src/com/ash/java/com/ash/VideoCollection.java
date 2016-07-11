package com.ash.java.com.ash;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashokbance on 18/05/16.
 */
public class VideoCollection {

    private List<Video> list = new ArrayList<>();


    public VideoCollection addVideo(Video video) {

        list.add(video);
        return this;
    }

    public List<Video> getVideos() {
        return list;
    }

}