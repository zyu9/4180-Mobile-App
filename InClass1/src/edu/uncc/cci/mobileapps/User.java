package edu.uncc.cci.mobileapps;

public class User implements Comparable<User>{
    String firstname, lastname, email, gender, city, state;
    int age;

    //Constructor
    public User(String line){
        String[] items = line.split(",");

        this.firstname = items[0];
        this.lastname = items[1];
        try {
            this.age = Integer.parseInt(items[2]);
        }catch(NumberFormatException e){

        }
        this.email = items[3];
        this.gender =  items[4];
        this.city = items[5];
        this.state =  items[6];
    }

    public int compareTo(User o){
        return -1 * (this.age - o.age);
    }

    public static boolean compareState(User a, User b){return a.state.equals(b.state);}
}
