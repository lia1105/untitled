package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int row =0;
        for (int i=2; i<100; i++) {
        for (int j=2; j<=i; j++){
            if (i/j>=2){
            if(i%j>0){
              continue;
              }
              break;
            }
            else if (i%j==0){
                System.out.print (i+" ");
                row++;

            }
            if (row==5){
                System.out.println();
                row=0;
            }
        }

        }
    }
}
