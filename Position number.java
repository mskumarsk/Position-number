package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=scan.nextInt();
        System.out.println("Enter the position number:");
        int position= scan.nextInt();
        int ans=no;
        for (int i=1;i<=10;i++){
            ans=ans*no;
            if (i==position){
                System.out.println("Answer: "+ans);
                break;
            }
        }
    }
}
