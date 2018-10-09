package Tracker;

import java.util.Scanner;

public class Test {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your first name?");
    User.firstName = input.next();

    System.out.print("What is your last name?");
    User.lastName = input.next();

    System.out.print("What is your email?");
    User.email = input.next();

    System.out.print("How old are you?");
    User.age = input.next();
}
