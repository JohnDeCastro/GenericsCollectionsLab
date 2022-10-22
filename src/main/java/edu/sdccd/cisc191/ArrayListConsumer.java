package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
     private ArrayList<String> list; //arraylist container

    //constructor takes in arraylist of strings
    public ArrayListConsumer(ArrayList<String> someArrayList){
        list = someArrayList; //sets given arraylist to current arraylist
    }

    public String consume(){
        //calling ".remove()" removes value at specified index, and returns value removed
        return list.remove(0); //return removed value to pass test
    }

}