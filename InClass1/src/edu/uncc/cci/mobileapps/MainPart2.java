package edu.uncc.cci.mobileapps;

import java.util.*;

public class MainPart2 {
    /*
    * Question 2:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - The goal is to count the number of users living each state.
    * - Print out the list of State, Count order in ascending order by count.
    * */

    public static void main(String[] args) {
        int count = 0;
        //Create HashMap, should have state as Key, count as value
        HashMap<String, Integer> state = new HashMap<>();

        //Create ArrayList and store the data
        ArrayList<User> al = new ArrayList<>();
        for (String i : Data.users){
            al.add(new User(i));
        }

        //Find the count for each state
        for (int i = 0; i < al.size(); i++) {
            //Compare state, if equal then count++
            if(User.compareState(al.get(i), al.get(i+1))){
                count++;
            }
        }

        //Store data for hashmap
        for (User user : al) {
            //Store state as Key, Store count as value
            state.put(user.state, count);
        }

        //Sort in ASC order by key
        ArrayList<String> stateByKey = new ArrayList<>(state.keySet());
        Collections.sort(stateByKey);

        //To print Key and value
        for(String i : stateByKey){
            System.out.println("State & Count: " + i);
        }
    }
}