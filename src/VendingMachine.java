package com.bridgelabz;
import java.util.Scanner;
public class VendingMachine {
public static void main(String[] args) {
    int note;
    int[] VendingMachineNotes= {1,2,5,10,50,100,500,1000};
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please Enter the money to get from vending machine");
    double money=scanner.nextInt();
    int minnotes=0;
    for(int i=7;i>=0;i--) {
        if(money>=VendingMachineNotes[i]) {
            note=(int) (money/VendingMachineNotes[i]);
        money=money-note*VendingMachineNotes[i];
        minnotes=minnotes+note;
        System.out.println("Notes of " +VendingMachineNotes[i]+"="+minnotes);
        }
    }
System.out.println("Total Number of notes"+minnotes);
}

}
