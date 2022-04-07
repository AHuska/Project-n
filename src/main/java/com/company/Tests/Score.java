package com.company.Tests;
import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class Score {

    public Score() {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add( 6.3);
        list.add( 7.4);
        list.add( 5.9);
        list.add(4.3);
        list.add(3.7);
        for (int i = 0;  list.get(i) > 5.5; i++){
            System.out.println(list.get(i));

        }

    }

}
