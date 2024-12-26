package Concepts;

/*Arrays are special containers in Java that can be used to hold many of one type of variable.
* For example, an array of integers holds a certain amount of integer numbers.
*
* Here is an example below of an array integers holding 5 numbers:
*
* */

import java.util.Arrays;

class ArrayOf5Numbers {
    public static void main(String[] args) {
        int[] fiveNumberArray = {1, 2, 3, 4, 5};
    }
}

/*That five-number array holds the integer numbers 1 to 5.
*
* To access a certain value (element) within the array, you need to call the array's name, beside a "[]" brace, and then inside the brace,
* you want to put the index number of the element you want to access. Now, you might be thinking that if you wanted to access the first element in the
* array, that the index number for that element would be 1. But no. Array index numbers start at 0, so the index number for the first element,
* (element #1) would be 0, and then the index number for the second element would be 1, and then 2 for the third element, and so on and so forth.
*
* Below is an example of when of accessing the first element within an integer array, and then outputting it value to the console:
*
* */

class AccessingArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]); //arr[0] represents the first element in the array (which is 1), using the array's name beside the "[]" brace, and then the index number of the element inside the brace.
    }
}

/*For changing the value of an array element, all you need is access the element slot in which you want to put whatever value of the variable that you want to
* store there. So, again, you will need to use the special method for accessing an array element (array's name + "[]" brace + array index number inside the brace)
* to access it. Then, once you've made that line of code, you then just use the same method that you already do to assign variables new values, which is
* then to add an "=" sign and then the new value corresponding with the variable type.
*
* Here is an example below of what you would to do to change the value of the second element in an array:
*
* */

class ChangingArrayElementValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[1] = 1; //Accessed the second element in the array (which currently holds a value of 2) and then assigned it a new integer value of 1.
        System.out.println(Arrays.toString(arr));
    }
}
