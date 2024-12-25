package Concepts;

/*You've probably already heard of ArrayLists before, but what they are essentially is just advanced versions of arrays,
* where they carry multiple of one type of variable. There is one big difference between arrays and ArrayLists though, is that
* arrays have a set size, so they can only carry so many of one variable type, but ArrayLists can be adjusted in terms of size, so they
* can carry as many of one variable type as they want.
*
* Example:
*
* If you created an integer named arr, and then you put this as it value -> {1, 2, 3, 4, 5}, then the array would have a length of
* 5 with the values "1, 2, 3, 4, 5,". But, because it is an array, the array can't anything else added to it because it has a set length of 5,
* and all of its slots are taken up by elements.
*
* If you created an ArrayList of Integer named list, and then added the value of 5 to it using the add() method, then right then the ArrayList
* would have a set length of 1 because it only has one element in it so far. But here's the interesting part.  If you added another number ot it, like say 2,
* using hte add() method, then the ArrayList's length would now be CHANGED to 2, and then ArrayList would now contain two integers, 1 and 2, instead of
* just 1. So this is the difference between ArrayLists and arrays, is that ArrayLists can have their size adjusted to fit the amount of elements that going to
* eventually go into them, and arrays can't.
*
* Down below is an example of an ArrayList getting element put into it versus an array:*/

import java.util.ArrayList;
import java.util.Arrays;

class ArraysVsArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array can only stay the same: " + Arrays.toString(arr));

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);

        System.out.println("List before: " + list);

        list.add(2);

        System.out.println("List after: " + list);
    }
}
