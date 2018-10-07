//package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Main {

    //Function to check whether the input digit is present in the random array




    }public static boolean check(int input , int random[])
    {
        for(int i = 0 ; i< 5 ; i++)
        {
            if(input == random[i])
            {
                return true;
            }
        }
        return false;
    }

    public static void crack(int randomNum[])
    {   boolean win = false;
        int input[] = new int[5];
        int tries = 0;
        int count = 0;
        int j=0;
        int d;

        while(true) {
            Scanner t = new Scanner(System.in);

            //Accepting input
            int n = t.nextInt();
            int x = 0;
            while (n > 0) {
                input[x] = n % 10;
                n = n / 10;
                x++;
            }

            System.out.println("Guees");

            //  while(j<5)
            //  {
            for (int i = 0; i < 5; i++) {
                if (input[i] == randomNum[i]) {
                    count++;
                    System.out.print("R");
                }
                if (count == 4) {
                    win = true;
                    break;
                }
                else if (check(input[i], randomNum)) {
                    System.out.print("S");
                } else if(check(input[i], randomNum) == false){
                    System.out.print("X");
                }
                tries++;

                //  j++;
            }
            System.out.println();
            // }
            if (win) {
                System.out.println("You guessed the correct answer");
                System.out.println("");
            } else if (tries == 8) {
                System.out.println("you failed");
                return;
            }else {
                continue;
            }
        }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Gusee the code");
        System.out.println("Rules\n1.R means digit is at right position");
        System.out.println("2.S means digit is in code but on wrong position");
        System.out.println("3.X means digit is wrong");
        int n;

        int randomNum[] = new int[5];

        //Random no. is generated here
        for (int i = 0 ; i < 5 ; i++)
        {
            randomNum[i] = ThreadLocalRandom.current().nextInt(0, 9);
        }

        do {
            crack(randomNum);
            System.out.print("press 1 to continue and 2 to end");
            Scanner t = new Scanner(System.in);
            n = t.nextInt();
        }while (n == 1);

    }
}
