package csc241;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyNumbers implements Iterable<Integer>{

  ArrayList<Integer> myNumbers;

    public MyNumbers(int size){
        // Initialize list
        myNumbers = new ArrayList<Integer>();
        // Fill with random numbers bounded by size
        Random rGen = new Random();
        for (int i = 0; i < size; i++) {
            // Add a new number
            myNumbers.add(rGen.nextInt(size));
        }
    }


    @Override
    public Iterator iterator() {
        return myNumbers.iterator();
    }
}
