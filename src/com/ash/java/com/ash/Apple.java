package com.ash.java.com.ash;

/**
 * Created by ashokbance on 08/05/16.
 */
public class Apple {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
