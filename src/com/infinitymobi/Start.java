package com.infinitymobi;

import javax.swing.*;

import static java.lang.System.out;
import java.util.Scanner;

public class Start {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        //test();
        Console con = new Console();
        con.mRun(mGetLineSize(),mGetBreakIndicator(),mGetAlignment());

    }

    public static char mGetBreakIndicator(){
        char indicator=' ';
        do{
            String temp = JOptionPane.showInputDialog("w: to break on words \nc: to break on Characters")
                    .toLowerCase();
            //out.println("Enter 'w' to break on words \n'c' to break on Characters");
            //out.print("Choice: ");

            indicator = temp.toCharArray()[0];
        }while(indicator!='w' && indicator!='c');
        return indicator;
    }
    public static int mGetLineSize(){
        //out.print("Enter line size: ");
        return Integer.parseInt(JOptionPane.showInputDialog("Enter Line Size"));
    }
    public static char mGetAlignment(){
        char indicator='l';
        do{
            String temp = JOptionPane.showInputDialog("L: Left align \nR: Right align")
                    .toLowerCase();
            indicator = temp.toCharArray()[0];
        }while(indicator!='l' && indicator!='r');
        return indicator;
    }
    static void test(){
        String str = "line 1 line 1 line 1 line 1 line 1 line 1 line 1 line 1 line 1 line 1";
        out.printf("%100s%n",str);
        String str2 = "line 2 line 2 line 2 line 2 line 2 line 2 line 2 line 2 line 2 line 2 line 2 line 2";
        out.printf("%100s%n",str2);
        String str3 = "line 3 line 3 line 3line 3 line 3 line 3 line 3 line 3 line 3";
        out.printf("%100s%n",str3);
        String str4 = "line 4 line 4 line 4 line 4 line 4 line 4 line 4 line 4 line 4 line 4 line 4";
        out.printf("%100s%n",str4);
    }
}
