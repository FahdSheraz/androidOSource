package com.gohooljava.com;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int myArray[] = {1,3,5};

        for (int i = 0; i < 10; i++) {
            System.out.println("MyArray" + myArray[i]);

        }


//      




    ArrayList animals = new ArrayList();
    animals.add("Pig");
    animals.add("Cow");
    animals.add("Parrot");

    //How to get items to print ou
    System.out.println(animals.get(0)); // output == Pig
    System.out.println(animals.get(1)); // output == Cow

    //We can also remove and do all sort of things wiht ArrayLists
     animals.remove(0); //removes the first item in our arraylist

     //we can add items on the fly
     animals.add(0, "Dog"); //add Dog on index 0

     //We can remove by calling the object name
     animals.remove("Cow"); //will remove "Cow"

  	//Find the size of the arraylist
     animals.size();
    //How to iterate through our arrayList


     //use "contains()" method to do some checking logic
     if (animals.contains("Cow")) {

     	 //Do something here!
     	
     }

    for (int i=0; i<animals.size(); i++ ) {
    	System.out.println("Animals:" +animals.get(i)); // get all animals in our arraylist
    	
    }

    //Enhanced for-loop
    for(Object animal : animals) {

    		System.out.println("Animals:" +animal; // get all animals in our arraylist
    }






//
//        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
//        String[] myStringArray = {"Hello", "Hi", "What"};
//
//
//        int[] newArray = new int[5];
//        String[] newStringArray = new String[5];
//
//        newArray[0] = 3;
//        newArray[1] = 4;
//        newArray[2] = 6;
//        newArray[3] = 1;
//        newArray[4] = 12;
//
//        newStringArray[0] = "Marcos";
//        newStringArray[1] = "James";
//        newStringArray[2] = "Jason";
//        newStringArray[3] = "Laura";
//        newStringArray[4] = "Bonni";
//
//
//
//
//
//        //Arrays have length.
//        for (int i = 0; i < newStringArray.length ; i++) {
//            System.out.println("Item  " + newStringArray[i]);
//        }
//

    }
}
