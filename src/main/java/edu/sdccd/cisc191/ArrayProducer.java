package edu.sdccd.cisc191;

public class ArrayProducer {

    String[] array; //variable container for given string[]

    public ArrayProducer(String[] someArray){
        array = someArray; //sets given array to current array
    }

    public void produce(int index, String someString){
        array[index] = someString; //takes in int for index, and someString as element placed in given index
    }
}
