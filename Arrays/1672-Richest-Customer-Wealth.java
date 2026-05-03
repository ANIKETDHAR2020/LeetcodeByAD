//package com.ad;

public class sumofrow {
    public static void main(String[] args) {
        int [] [] accounts = {{1,2,3},{3,2,1}};

        System.out.println(sum1(accounts));
    }
    static int sum1 (int[][] accounts){
        int max =0;
        for(int row =0 ; row <accounts.length; row++ ){
            int sum =0;
            for(int column=0 ; column< accounts[row].length;column ++){
                sum= sum+accounts[row][column];

                }if(sum >max)
                {
                    max = sum;
                }

        } return max;
    }
}

