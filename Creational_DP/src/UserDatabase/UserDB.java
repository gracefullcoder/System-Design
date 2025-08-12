package Creational_DP.src.UserDatabase;

import java.util.ArrayList;
import java.util.List;

//Singelton DP
public class UserDB {

    private static List<User> users;

    private static UserDB instance;

    //constructor is private so only getInstance can make do it creation only once
    private UserDB(){
        //made it private so no one outside can make object of this
        users = new ArrayList<>();
    }

    //synchroniz ed bcoz java is multithreaded so a single thread can access at a time
    public static synchronized UserDB getInstance(){
        if(instance == null){
            instance = new UserDB();
        }

        return instance;
    }

    public static boolean addUser(User newUser){
        if(instance == null) getInstance();
        
        for(User prev : users){
            if(prev.getUserName().equals(newUser.getUserName())){
                System.out.println("user with username " + newUser.getUserName() + " Already Exists");
                return false;
            }
        }

        users.add(newUser);
        
        System.out.println("New User with username " + newUser.getUserName() + " Added Successfully");
        return true;
    }
}
