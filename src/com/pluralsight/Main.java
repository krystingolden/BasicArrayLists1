package com.pluralsight;

import java.util.ArrayList;

public class Main {

        /*
    https://programmingbydoing.com/
    Basic arraylists 1 - Assignment #178
     */

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        int index;

        for (index = 0; index < 10; index++){
            integers.add(-133);
        }

        for (index = 0; index < integers.size(); index++){
            System.out.println("Slot " + (index + 1) + " contains a " + integers.get(index));
        }

    }
}
