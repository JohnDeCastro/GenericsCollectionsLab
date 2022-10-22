package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {

    private HashMap<String, String> map; //map container of hashmap type with string key and string value

    public HashMapConsumer(HashMap<String, String> someHashMap){
        map = someHashMap; //constructor sets given hashmap to current hashmap
    }

    public String consume(String string){
        return map.get(string); // returns value returned from calling .get() via associate key
    }
}
