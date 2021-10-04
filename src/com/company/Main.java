package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Problem 1 :Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15 and notice the result (console should not display anything).
        int x = 7 ;
        if (x<10){
            System.out.println("x is less than 10");
        }
       // yes if I change x to 10 it will not display anything.

       Problem : 2 Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else
            statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is
        greater than 10. Change x to 15 and notice the result.


        int x = 7 ;
        if (x<10){
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is greater than 10");

        }
        when x =7 it dispalys x is less than 10
        when x=15 it dispalys x is greate than 10
        */
        /* Problem 3 :

        Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an “if-else-if”
        statement that prints out “Less than 10” if x is less than 10, “Between 10 and 20” if x is greater
         than 10 but less than 20, and“Greater than or equal to 20” if x is greater than or equal to 20.
        Change x to 50 and notice the result.*/

//            int x =15 ;
            int x =50;
            if (x < 10){
                System.out.println("Less than 10");
            }else if (x > 10 && x <20){
                System.out.println("Between 10 and 20");
            }else if (x >= 20){
                System.out.println("Greater than or equal to 20");
            }



//          Problem 4 :
//        Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an “
//        if-else-if” statement that prints out “Less than 10” if x is less than 10, “Between 10 and 20”
//        if x is greater than 10 but less than 20, and“Greater than or equal to 20” if x is greater than
//        or equal to 20. Change x to 50 and notice the result.

//             int x = 1;
             /*int x =15;
                if (x<10){
                    System.out.println("Less than 10");
                }else if (x > 10 && x <20){
                    System.out.println("Between 10 and 20");
                }else if(x >=20){
                    System.out.println("Greater than or equal to 20");
                }*/

//        Problem 5:Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to
//        the following criteria:
//        A: 90-100
//
//        B: 80-89
//
//        C: 70-79
//
//        D: 60-69
//
//        F: <60
//
//        Use the Scanner class to accept a number score from the user to determine the letter grade.
//        Print out “Score out of range.” if the score is less than 0 or greater than 100.

       /* Scanner input = new Scanner(System.in);
        char letterGrade;
        int numberScore;
        System.out.println("Please enter your grade:");
        numberScore  = input.nextInt();
        if (numberScore >= 90 && numberScore <= 100){
            letterGrade = 'A';
            System.out.println("your Letter Grade is "+ letterGrade);
        } else if (numberScore >= 80 && numberScore <= 89){
            letterGrade = 'B';
            System.out.println("your Letter Grade is "+ letterGrade);
        } else if (numberScore >= 70 && numberScore <= 79) {
            letterGrade = 'C';
            System.out.println("your Letter Grade is "+ letterGrade);
        } else if (numberScore >= 60 && numberScore <= 69) {
            letterGrade = 'D';
            System.out.println("your Letter Grade is "+ letterGrade);
        } else if (numberScore >=0 && numberScore <= 60){
            letterGrade = 'F';
            System.out.println("your Letter Grade is "+ letterGrade);
        } else if (numberScore <0 || numberScore > 100) {
            System.out.println("Score out of range");
        }*/

        /* Problem 6: Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to
        print out the corresponding weekday. Print “Out of range” if the number
        is less than 1 or greater than 7. Don’t forget to include “break” statements in each of your cases.*/

         Scanner input = new Scanner(System.in);
         int number;
         System.out.println("Please integer between 1 and 7 :");
         number = input.nextInt();
         switch(number){
             case 1 : System.out.println("it's Monday");
                      break;
             case 2 : System.out.println("it's Tuesday");
                      break;
             case 3 : System.out.println("it's Wednesday");
                      break;
             case 4 : System.out.println("it's Thursday");
                      break;
             case 5 : System.out.println("it's Friday");
                      break;
             case 6 : System.out.println("it's Saturday");
                      break;
             case 7 : System.out.println("it's Sunday");
                      break;
        }


    }
}
