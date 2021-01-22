package edu.uncc.cci.mobileapps;
import java.util.*;

public class MainPart1 {
    /*
    * Question 1:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - Insert each of the users in a list.
    * - Print out the TOP 10 oldest users.
    * */

    public static void main(String[] args) {
        //Create ArrayList and store the data
        ArrayList<User> al = new ArrayList<User>();
        for (String i : Data.users){
            al.add(new User(i));
        }

        //Print the unsorted list
        System.out.println("Unsorted");
        for(User i : al){
            System.out.println(i);
        }

        //Find and Print the Top 10 users
        for(int i = 0; i < al.size(); i++){
            Collections.sort(al);
        }

        System.out.println("\nTop 10 oldest users: ");
        for(int i = 0; i < 10; i++){
            System.out.println(al.get(i));
        }

    }
}