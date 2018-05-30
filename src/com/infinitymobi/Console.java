package com.infinitymobi;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;
public class Console {
    //private BufferedReader vBufferReader;

    File file = new File("C:\\Users\\infinity\\Documents\\IdeaProjects\\IdeaProjects\\" +
            "TaskA_Console_Application\\" +
            "src\\com\\infinitymobi\\" +
            "file.txt");

    int mCount(char[] lineArray){
        int count = 0;
        for (char aLineArray : lineArray) {
            if (aLineArray == ' ' && (aLineArray!='.' || aLineArray!=',')) {
                count++;
            }
        }

        return count;
    }
    private boolean mParameterOne(String line, int lineSize){
        char lineArray [] = line.toCharArray();

        int n = mCount(lineArray);
        if(n>lineSize){
            return false;
        }else{
            //out.println(line);
            return true;
        }
    }

    private void mParameterTwo(String line,char action,char vLeft_Right){
        int vAction;
        if(action=='w'){
            vAction=0;
        }else{
            vAction =1;
        }
        switch(vAction){
            case 0:
                char arrayW [] = line.toCharArray();
                String temp ="";
                for (char anArray : arrayW) {
                    temp = (temp + "" + String.valueOf(anArray));
                    if (anArray == ' ') {
                        mParameterThree(temp,vLeft_Right);
                        //out.println(temp);
                        temp = "";
                    }
                }
                break;
            case 1:
                char arrayC [] = line.toCharArray();
                for(char anArray : arrayC){
                    mParameterThree(String.valueOf(anArray),vLeft_Right);
                    //out.println(anArray);
                }
                break;
            default:

                break;

        }
    }
    private void mParameterThree(String line, char vLeft_Right){
        switch(vLeft_Right){
            case 'l':
                out.println(line);
                break;
            case 'r':
                out.printf("%100s%n",line);
                break;
        }
    }
    void mRun(int lineSize, char action, char vLeft_Right){
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine())!=null){
                if(mParameterOne(line,lineSize)){
                    mParameterTwo(line,action, vLeft_Right);
                    //mParameterThree(line,l_R);
                }


                out.println(line);

            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
