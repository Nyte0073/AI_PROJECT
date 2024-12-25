package Concepts;

/*You've probably seen people use the word "final" next to variable names, methods, and even class names, but what does "final"
* mean?
*
* The "final" keyword in Java can be used for many purposes, depending on what it is being used for.
*
* Here are all the uses for the "final" keyword in Java:
*
* 1. Declaring variables final
*
* When you put the "final" keyword on a variable, it means that the variable can no longer be assigned a new value again in a program.
* Like, for example, let's say we created an integer variable named integer, and then we made integer equal to a new integer variable. So, it would
* look something like below:
*
* int integer = 80;
*
* If we used the "final" keyword on it, like this: final int integer = 80;, then this integer variable will always be equal to 80 and if you try to change
* its value, Java will give you an error because this variable's value is permanent and cannot be changed. So when you use the final keyword on a variable that
* can be assigned a value on declaration, then the value of that variable cannot be changed afterward.
*
* Also, the final keyword does something special to the variables that can't have a value assigned to them within their declaration. For example,
* if you made a new ArrayList variable, it would look something like this -> ArrayList <Integer> list = new ArrayList<>();. But the thing is, the ArrayList
* isn't given a value when the ArrayList is made new, it's just made equal to a new ArrayList object. In this case, the final keyword would be used to make
* that variable or whatever variable that doesn't get a value assigned to it in its declaration so that it can't be made into a new object again, and I
* know that doesn't make sense to you now, so I'll give an example.
*
* If, for say, you made a new ArrayList object, and you made the object final, so it would look like this -> final ArrayList <Integer> list = new ArrayList<>();,
* then this object can no longer be made into a new object. What I mean by that is that you can longer do this to the object anymore -> list = new ArrayList<>(),
* because the final keyword in front of the object's name means that it can only be initialized once, and can never be initialized again after that one time.
*
* Here is an example below of what a final variable that doesn't have a value assigned to it looks like:*/

import java.util.ArrayList;

class FinalVariable {
        public static void main(String[] args) {
            final ArrayList <Integer> list = new ArrayList<>();
            //list = new ArrayList<>(); Cannot do this again because this will give an error. can only do it once and never again after that.
        }
    }

/*
* 2. Declaring methods final
*
* When you use the final keyword on a method, this method can no longer be overridden. What it means when you are overriding a method is when you
* take a method from one class, create the same one in an extending class, and then make it do something different from in the original method.
* If you don't know what an extending class is, it is basically a class that acts like an extension of another class. Like, say you created the class named Parent,
* and then you created another class named Child. To make the Child class an extension of the Parent class, we need to add the "extends" keyword to it and then the class
* that the Child class is extending, which is the Parent class. So overall, it would look something like below.=:
*
*
* */

class Parent {
    public void method() {
        System.out.println("This is the original method.");
    }
}

class Child extends Parent {
    @Override
    public void method() {
        System.out.println("This is the overridden Parent method called method().");
    }
}

/*In the Parent class, we have one method named method(), which just outputs some text to the console. But then in the Child class, we have the same
* method, like the Parent class, but it is overridden because it does something different from the method() method in the Parent class. This is what overriding is.
* You take a method from one class, and you override it and make the same method do something different in another extending class.
*
* Now, if you used the "final" keyword with that method() method in the Parent class, then the Child class wouldn't have been able to override it
* because the method is now declared as final, meaning it can't be overridden by any other class. The method is only stuck being able to do only one thing and that's it.
*
*
* 3. Declaring classes final
*
* You can also declare classes final in Java, simply by putting the final keyword in front the "class" part of the class name. When you make a class final
* in Java, it means that the class cannot be extended by any other class.
*
* For example, if we took the Parent class from earlier, and we made that class final, so it would look like this -> final class Parent {}, then the Child
* class wouldn't have been able to extend that class because it is now declared as a final class in Java, meaning it can't have any other extensions of itself in
* other classes.*/
