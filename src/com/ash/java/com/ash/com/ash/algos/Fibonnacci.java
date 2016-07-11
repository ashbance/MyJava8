package com.ash.java.com.ash.com.ash.algos;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by ashokbance on 29/06/16.
 */
public class Fibonnacci {

    public static void main(String[] args) {
        Fibonnacci f = new Fibonnacci();
//
//        for (int a=0; a < 8; a++) {
//            System.out.println(f.generate(a));
//        }

        f.generateWithLambda((Integer x, Integer y) -> x+y);
    }

    private int generate(int x) {

        int a = 1;
        int b = 1;
        int sum = 0;

        if (x <= 1) {
            return 1;
        }

        for (int i = 2; i <= x; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }


    private void generateWithLambda(BinaryOperator<Integer> f) {



//        Predicate<Integer> add = x -> x + 1 > 5;
//
//        Predicate<Integer> isOdd = n -> n % 2 != 0;
//        BinaryOperator<Integer> sum = (x, y) -> x + y;
//
//        System.out.println(sum.apply(55,2));

        doit((Person p) -> p.getAge() > 10);
    }


    private void doit(Predicate<Person> pred) {


        if (pred.test(new Person(15))) {
            System.out.println("yes test");
        }
        else {
            System.out.println("no test");
        }

    }


}



class Person {
    private int age = 10;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}