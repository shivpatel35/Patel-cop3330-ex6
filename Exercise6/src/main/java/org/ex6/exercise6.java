package org.ex6;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        //Declaration of scanners for user age and desired retiring age
        Scanner age = new Scanner(System.in);
        Scanner retire = new Scanner(System.in);

        //int variables for retire age and user age
        int user_age = 0;
        int ret_age = 0;

        //User input for current age
        System.out.println("What is your current age?");
        user_age = age.nextInt();

        //User input for desired retirement age
        System.out.println("At what age would you like to retire?");
        ret_age = retire.nextInt();

        //Prints out and calculates the years left before user's retirement
        System.out.println("You have " + (ret_age - user_age) + " years before you retire." );

        //Prints out and calculates what year user will retire
        System.out.println("It's 2020, so you can retire in " + (2020 + (ret_age-user_age)));





    }
}
