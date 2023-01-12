package com.example.workoutapp.workoutapp.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="TBL_USERS")
public class User {

    // private String id;
    @Id
    private String username;
    private String password;


    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(){
        this.username = "";
        this.password = "";
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    //public String getId(){
      //  return this.id;
   // }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    //public void setId(String id){
       // this.id = id;
   // }

    
}

