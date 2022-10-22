package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapProducer {

    private HashMap<String, String> map; //map container of hashmap type with string key and string value

    public HashMapProducer(HashMap<String, String> someHashMap){
        map = someHashMap; //constructor sets given hashmap to current hashmap
    }

    public void produce(String key, String value){
        map.put(key, value); //calling .put() associates given value with given key
    }
}
