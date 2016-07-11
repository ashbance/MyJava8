package com.ash.java.com.ash;

import java.util.List;

/**
 * Created by ashokbance on 18/05/16.
 */
public class VideoController {

    private VideoCollection collection;


    public VideoController(VideoCollection collection) {
        this.collection = collection;
    }

    public List<Video> generateVideoCollection() {

        VideoCollection v  = collection.addVideo(new Video("1", "url1", "mp4"))
                .addVideo(new Video("2", "url2", "mp4"))
                .addVideo(new Video("3", "url2", "mp4"))
                .addVideo(new Video("4","url2","mp4"))
                .addVideo(new Video("5","url2","mp4"))
                .addVideo(new Video("6","url2","mp4"))
                .addVideo(new Video("7","url2","mp4"))
                .addVideo(new Video("8","url2","mp4"))
                .addVideo(new Video("9","url2","mp4"))
                .addVideo(new Video("10","url2","mp4"))
                .addVideo(new Video("11","url2","mp4"));

        return v.getVideos();

    }


    public void printVideoList() {
        System.out.println("Printing video list");
        collection.getVideos().stream().forEach(video -> System.out.println(video.getName()));
    }





}
