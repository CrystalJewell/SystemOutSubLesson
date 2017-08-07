package com.company;

public class Main {

    public static void main(String[] args) {

        /* 1.1
        System.out is a very useful utility that we us in Java. This allows us to output something to the system.
        This can be to prompt a user for input, show the answer to an equation or anything else that we think it would
        be useful to show the user.
         */

        /* 2.1
        There are many properties that we can use with System.out, one of which we have already used in another lesson,
        .println();  What println does is prints what we tell it on its own line
         */

        /* 3.1
        System.out.println();

        This will take whatever we want it to display on the screen and place it on its own line.
         */

        //3.2
        System.out.println("This item is on its own line");
        System.out.println("So is this one");
        String words = "It makes statements easier to read";
        System.out.println(words);
        System.out.println("When they are separated like this");
        System.out.println("We can even do math, see");
        System.out.println(1 + 2 - 4 * 5);

        /* 4.1
        System.out.print();

        This takes whatever we want to display and puts them on the same line
         */

        //4.2
        System.out.print("This item is on its own line");
        System.out.print("So is this one");
        String words2 = "It makes statements easier to read";
        System.out.print(words2);
        System.out.print("When they are separated like this");
        System.out.print("We can even do math, see");
        System.out.print(1 + 2 - 4 * 5);
        System.out.println("");

        /* 5.1
        System.out.printf();

        This one is a little different from the other two, it gives a little more control over how our data is displayed
        on the screen.  The f stands for format, so we can tell it how to format what we want to show on the screen.

        Formatting specifiers
        %d	        Displays a decimal (base 10) integer
        %f	        Display a floating point value in decimal format
        %e or %E	Display a floating point number in exponential notation
        %c or %C	Display characters
        %s or %S	Display Strings
        %b or %B	Display boolean values
        %%	        Display a % sign
         */

        //5.2
        int number = 42;
        String someWords = "Thanks for all the fish";
        System.out.printf("So long and %s! %d is the answer", someWords, number);

        //6.1 - Uncomment when needed
//        System.out.printf("So long and %s! %d is the answer", number, someWords);

    }
}
