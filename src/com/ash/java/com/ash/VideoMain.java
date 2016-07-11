package com.ash.java.com.ash;

/**
 * Created by ashokbance on 18/05/16.
 */
public class VideoMain {

    public static void main(String[] args) {

        VideoController controller = new VideoController(new VideoCollection());
        controller.generateVideoCollection();

        controller.printVideoList();
    }


}
