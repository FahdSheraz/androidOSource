package com.gohooljava.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// Hashmaps (key --> value)

        HashMap<Integer, String> newUsers = new HashMap<>();
        newUsers.put(23, "Sandra");

        HashMap users = new HashMap();
        users.put("Sandra", 23);
        users.put("Paul" , 31);
        users.put("George" , 74);
        users.remove("Sandra");

       // System.out.println(users.get("Paul"));

        Iterator iterator = users.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

       // System.out.println(users.entrySet());
    }
}
