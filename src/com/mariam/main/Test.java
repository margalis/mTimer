package com.mariam.main;

import com.mariam.model.TimerThread;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Input minute");
            int minute = s.nextInt();
            System.out.println("Input second ");
            int second = s.nextInt();

            TimerThread timer = new TimerThread(second, minute);
            timer.start();
            //so main-y 23rd toghy chi ani aveli shut
            while(timer.isAlive()){}

            System.out.println("Timer stopped, want to restart ? input yes, if so");
            if(!s.next().equalsIgnoreCase("yes")) break;
        }

    }
}
