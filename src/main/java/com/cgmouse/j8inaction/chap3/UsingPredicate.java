package com.cgmouse.j8inaction.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsingPredicate {

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                result.add(t);
            }            
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("One", "Two", "");
        Predicate<String> nonEmptyStringPredicate = str -> !str.isEmpty();
        List<String> nonEmpty = filter(listOfString, nonEmptyStringPredicate);

        System.out.println(nonEmpty);
    }
    
}
