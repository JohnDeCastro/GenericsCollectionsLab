package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {

    private HashSet<String> set; //set container for hashset

    public HashSetConsumer(HashSet<String> someHashSet){
        set = someHashSet; //constructor to take in hashset and initialize to set
    }

    public boolean consume(String someElement) {
        return set.remove(someElement); //removes someElement from hashset set
        //will return true if successful, else return false if not.
    }
}
