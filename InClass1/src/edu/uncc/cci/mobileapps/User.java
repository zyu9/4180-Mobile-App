package edu.uncc.cci.mobileapps;

import java.util.Objects;

public class User {
    String firstname, lastname, email, gender, city, state;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && firstname.equals(user.firstname) && lastname.equals(user.lastname) && email.equals(user.email) && gender.equals(user.gender) && city.equals(user.city) && state.equals(user.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, gender, city, state, age);
    }

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

    public static boolean compareState(User a, User b){return a.state.equals(b.state);}

    public static boolean compareUser(User a, User b){
        return a.age == b.age && a.firstname.equals(b.firstname) && a.lastname.equals(b.lastname) &&
                a.email.equals(b.email) && a.gender.equals(b.gender) && a.city.equals(b.city) &&
                a.state.equals(b.state);
    }
}
