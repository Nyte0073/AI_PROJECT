package Concepts;

/*There are many types of for-loops that can be used for different situations depending on what you're looping through
* and what the purpose the loop is going to have in your program.
*
* Here are two different types of for-loops that are commonly used in Java:
*
* 1. Regular For-Loop
*
* A regular for-loop, as you probably already know, is just a simple loop that starts with a start number and then ends with
* and ends with an end number and a condition to make sure that the loop stops when you want it to according to the
* condition's relation with the end number. The loop also has to have a way of changing the start number continuously until
* the condition in the loop is met.
*
* Down below is an example of a regular for-loop:*/

class RegularForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("This code is looping 6 times.");
        }
    }
}

/*This for-loop is set up so that it will loop six times, and here's why.
* The start number for the loop is 0, the end number is 6, and the condition says
* that for the loop to run, the start number has to be less than the end number. So the
* loop will run until i (which is the start number) is equal to 5, because "i" can't be equal to
* 6  anything greater than the end number. Thus, the loop will run exactly 6 times and stop.*/

/*2. Enhanced For Loop
*
* An enhanced for loop is kind of like a regular for loop where it will loop the code inside of it
* a certain number of times, but this loop has a much different purpose than the regular for loop. Instead of
* JUST looping the code inside of it and then ending, this loop is designed to loop through a collection of something,
* like an array or na ArrayList. The enhanced for loop doesn't use a start number, end number or condition because it is always set
* to loop through the ENTIRE collection that it is set to loop through and then finish automatically once it is done looping
* through the collection. Every time the loop loops, it returns a value from the looped collection that can use in the code put inside
* of it.
*
* Down below is an example of an enhanced for-loop:
* */

class EnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

/*The class above showcases an enhanced for-loop looping through an integer array. The integer "i" is being used
* by the enhanced for-loop to return a value from the array every time it loops, which is then outputted the console. So,
* essentially, the enhanced for loop is basically sysoutting every value in the array to the console, one at a time, which you've already done and know how to do.
* This is just the simpler way to do it.*/
