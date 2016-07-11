package com.ash.java;

import com.ash.java.com.ash.Apple;
import com.ash.java.com.ash.AppleHeavyWeightPredicate;
import com.ash.java.com.ash.ApplePredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.Comparator.comparing;

/**
 * Created by ashokbance on 07/05/16.
 */



public class MyMain {


    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("green", 150));
        inventory.add(new Apple("red", 100));
        inventory.add(new Apple("green", 75));
        inventory.add(new Apple("red", 180));
        inventory.add(new Apple("green", 200));
        inventory.add(new Apple("red", 300));



        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        inventory.sort(Comparator.comparing(Apple::getWeight));

        inventory.sort(comparing(Apple::getWeight));

        //MathOperation sum = (a, b)  -> {return a + b; };

        List<Apple>  l = filterApples(inventory, new AppleHeavyWeightPredicate());
        //List<Apple>  l2 = filterApples(l, new AppleGreenColorPredicate());

        List<Apple> l2 = filterApples(l, (Apple a) -> a.getColor().equals("red"));


        new Predicate<Apple>(){
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };



        filterApples2(l, a -> a.getColor().equals("green"));


        Runnable r = () -> System.out.println("tst");

        Runnable run = () -> System.out.println();

        process(()->System.out.println("Awesome"));





    }

    public static void process(Runnable r) {
        //
    }







    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> list = new ArrayList<>();

        for (Apple a : inventory) {
            if (p.test(a)) {
                list.add(a);
            }
        }

        return list;
    }

    public static <T> List<T> filterApples2(List<T> inventory, Predicate<T> p) {

        List<T> list = new ArrayList<>();

        for (T a : inventory) {
            if (p.test(a)) {
                list.add(a);
            }
        }

        return list;
    }



}



interface MathOperation {
    int operation(int a, int b);
}