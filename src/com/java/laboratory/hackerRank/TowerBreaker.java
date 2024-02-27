package com.java.laboratory.hackerRank;

import com.java.laboratory.ConsoleTextColour;

public class TowerBreaker {

    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */
    public static void main(String[] args) {
        System.out.println("WINNER: "+ConsoleTextColour.ANSI_YELLOW.getColour()+ towerBreakers(2,4)+ConsoleTextColour.ANSI_RESET.getColour());
        System.out.println("WINNER: "+ConsoleTextColour.ANSI_YELLOW.getColour()+ towerBreakers(1,4)+ConsoleTextColour.ANSI_RESET.getColour());
        //
    }
    public static int towerBreakers(int n, int m) {
        // Write your code here
        int winner = 0;
        if(m==1){
            winner = 2;
        }
        else if( n % 2 == 0){
            winner = 2;
        }
        else{
            winner = 1;
        }
        return winner;

    }
}

