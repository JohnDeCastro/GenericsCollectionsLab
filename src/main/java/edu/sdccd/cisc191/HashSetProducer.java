package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {

    private HashSet<String> set; //set container for hashset

    public HashSetProducer(HashSet<String> someHashSet){
        set = someHashSet; //constructor to take in hashset and initialize to set
    }

    public boolean produce(String someElement) {
        return set.add(someElement); //adds someElement to hashset set.
        //will return true if successful. will return false if element exists in set.
    }
}
