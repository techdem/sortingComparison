/* Data Structures CA2

Tudor Chiribes

NCI 2018 */

import javax.swing.*;
import java.lang.Math;


public class Tester {

    public static void main(String[] args) {

        long startTime, endTime, bubbleSortDescDuration, insertSortDescDuration, bubbleSortAscDuration, insertSortAscDuration;

        String quickest;

        MyArrayList<Integer> bubbleSortList = new MyArrayList<Integer>();

        MyArrayList<Integer> insertSortList = new MyArrayList<Integer>();

        for (int i = 0; i < 1500; i++) {

            bubbleSortList.add((int) (Math.random() * 3000) - 1500);
            insertSortList.add((int) (Math.random() * 3000) - 1500);
        }

//        System.out.println("The bubble list contains the following values: ");
//
//        for(int i : bubbleSortList) {
//
//            System.out.println(i);
//        }
//
//        System.out.println("The insert list contains the following values: ");
//
//        for(int i : insertSortList) {
//
//            System.out.println(i);
//        }

        startTime = System.nanoTime();

        bubbleSortList.bubbleSortDesc();

        endTime = System.nanoTime();

        bubbleSortDescDuration = endTime - startTime;

        System.out.println("The duration of bubble sort in descending order was: " + (bubbleSortDescDuration / 1000000) + " milliseconds");

//        System.out.println("Bubble list sorted by descending values: ");
//
//        for(int i : bubbleSortList) {
//
//            System.out.println(i);
//        }

        startTime = System.nanoTime();

        insertSortList.insertionSortDesc();

        endTime = System.nanoTime();

        insertSortDescDuration = endTime - startTime;

        System.out.println("The duration of insert sort in descending order was: " + (insertSortDescDuration / 1000000) + " milliseconds");

//        System.out.println("Insert list sorted by descending values: ");
//
//        for(int i : insertSortList) {
//
//            System.out.println(i);
//        }

        startTime = System.nanoTime();

        bubbleSortList.bubbleSortAsc();

        endTime = System.nanoTime();

        bubbleSortAscDuration = endTime - startTime;

        System.out.println("The duration of bubble sort in ascending order was: " + (bubbleSortAscDuration / 1000000) + " milliseconds");

//        System.out.println("Bubble list sorted by ascending values: ");
//
//        for(int i : bubbleSortList) {
//
//            System.out.println(i);
//        }

        startTime = System.nanoTime();

        insertSortList.insertionSortAsc();

        endTime = System.nanoTime();

        insertSortAscDuration = endTime - startTime;

        System.out.println("The duration of insert sort in ascending order was: " + (insertSortAscDuration / 1000000) + " milliseconds");

//        System.out.println("Insert list sorted by ascending values: ");
//
//        for(int i : insertSortList) {
//
//            System.out.println(i);
//        }

        if(bubbleSortDescDuration < insertSortDescDuration && bubbleSortDescDuration < bubbleSortAscDuration && bubbleSortDescDuration < insertSortAscDuration) {

            quickest = "the bubble sort in descending order.";
        }
        else if(insertSortDescDuration < bubbleSortAscDuration && insertSortDescDuration < insertSortAscDuration) {

            quickest = "the insertion sort in descending order.";
        }
        else if(bubbleSortAscDuration < insertSortAscDuration) {

            quickest = "the bubble sort in ascending order.";
        }
        else {

            quickest = "the insertion sort in ascending order.";
        }

        JOptionPane.showMessageDialog(null,"The execution time of the bubble sort algorithm in descending order was: "
                + (bubbleSortDescDuration/1000000) + " milliseconds.\n" + "The execution time of the insertion sort algorithm in descending order was: "
                + (insertSortDescDuration/1000000) + " milliseconds.\n" + "The execution time of the bubble sort algorithm in ascending order was: "
                + (bubbleSortAscDuration/1000000) + " milliseconds.\n" + "The execution time of the insertion sort algorithm in ascending order was: "
                + (insertSortAscDuration/1000000) + " milliseconds.\n\n" + "The quickest algorithm to execute was the " + quickest);
    }
}
