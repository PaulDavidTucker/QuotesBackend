package com.quotesbackend.quotesbackend.Model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Objects;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int User_ID;

    @Column(name = "Username")
    private String Username;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Karma")
    private int Karma;

    public Users() {};

    public Users(String Username, String Password, String Email, int Karma){
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Karma = Karma;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public int getKarma() {
        return Karma;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setKarma(int karma) {
        Karma = karma;
    }

    //Helper methods

    @Override
    public int hashCode() {
        return Objects.hash(this.User_ID, this.Username, this.Password, this.Email, this.Karma);
    }

    @Override
    public String toString() {
        return "User{" + "User_ID=" + this.User_ID + ", Username='" + this.Username + '\'' + ", Password='" + this.Password + ", Email='" + this.Email + ", Karma='" + this.Karma + '\'' + '}';
    }
}
