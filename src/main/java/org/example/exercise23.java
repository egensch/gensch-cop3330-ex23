/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        char choice1 = car.next().charAt(0);

        if (choice1 == 'y' || choice1 == 'Y')
        {
            System.out.print("Are the battery terminals corroded? ");
            char choice2 = car.next().charAt(0);

            if (choice2 == 'y' || choice2 == 'Y') {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            char choice2 = car.next().charAt(0);

            if (choice2 == 'y' || choice2 == 'Y')
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                    System.out.print("Does the car crank up but fail to start? ");
                    char choice3 = car.next().charAt(0);

                    if ((choice3 == 'y' || choice3 == 'Y'))
                    {
                        System.out.println("Check spark plug connections.");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.print("Does the engine start and then die? ");
                        char choice4 = car.next().charAt(0);

                        if ((choice4 == 'y' || choice4 == 'Y'))
                        {
                            System.out.print("Does the car have fuel injection? ");
                            char choice5 = car.next().charAt(0);

                            if ((choice5 == 'y' || choice5 == 'Y'))
                            {
                                System.out.println("Get it in for service.");
                                System.exit(0);
                            }
                            else
                            {
                                System.out.println("Check to ensure the choke is opening and closing.");
                                System.exit(0);
                            }
                        }
                        else
                        {
                            System.out.println("This should not be possible.");
                            System.exit(0);
                        }
                    }
            }

        }


    }
}

