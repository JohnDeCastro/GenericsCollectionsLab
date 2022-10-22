package edu.sdccd.cisc191;

public class ArrayConsumer {

    String[] array; //variable container for given string

    public ArrayConsumer(String[] someArray){
        array = someArray; //sets given array to current array
    }

    public String consume(){
        String removed; //string holder for element that will be removed

        if(array[0] == null){ //if first element is null
            removed = array[1]; //record element of second index to be returned
            array[1] = null; //consume second element and place as null
        } else{ //else if first element is not null
            removed = array[0]; //record element in first index to be returned
            array[0] = null; //consume first element and place as null
        }
        return removed; //return recorded element removed
    }
}
