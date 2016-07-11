package com.ash.java.com.ash;

/**
 * Created by ashokbance on 08/05/16.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
