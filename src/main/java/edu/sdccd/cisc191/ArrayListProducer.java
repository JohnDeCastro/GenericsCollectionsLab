package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
     private ArrayList<String> list; //ArrayList container

    //constructor to takes in arrayList of strings
    public ArrayListProducer(ArrayList<String> someArrayList){
        list = someArrayList; //sets parameter to current arraylist
    }

    //parameter takes in index int and string value to place into index
    public void produce(int i, String someString){
        list.add(i , someString); //sets given string to given index of current ArrayList
    }

}