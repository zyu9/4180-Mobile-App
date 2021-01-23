package edu.uncc.cci.mobileapps;

import java.util.*;

public class MainPart3 {
    /*
    * Question 3:
    * - This is a simple programming question that focuses on finding the
    * longest increasing subarray. Given the array A = {1,2,3,2,5,2,4,6,7} the
    * longest increasing subarray is {2,4,6,7}, note that the values have to be
    * contiguous.
    * */

    public static void main(String[] args) {
        //Create hash sets and store data
        HashSet<User> user = new HashSet<>();
        HashSet<User> otherUser = new HashSet<>();
        HashSet<User> sameUser = new HashSet<>();

        for (String i : Data.users){
            user.add(new User(i));
        }
        for (String i : Data.otherUsers){
            otherUser.add(new User(i));
        }

        for(User i : user){
            for(User j : otherUser){
                if(User.compareUser(i, j)){
                    //Have the same user
                    sameUser.add(i);
                }
            }
        }

        ArrayList<User> sameUserList = new ArrayList<>(sameUser);

        //Sort the sameUser by state
        Collections.sort(sameUserList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return -1 * (o1.state.compareToIgnoreCase(o2.state));
            }
        });

        sameUser = new LinkedHashSet<>(sameUserList);
        System.out.println(sameUser);

    }

}