package uni.pl.fmi;

import java.util.*;

/**
 * 
 */
public class Parent {

    /**
     * Default constructor
     */
    public Parent() {
    }

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public String email;

    /**
     * 
     */
    public String firstName;

    /**
     * 
     */
    public String lastName;

    /**
     * 
     */
    public Set<Student> Student;


    /**
     * 
     */
    public Journal Journal;

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Set getGrades() {
        // TODO implement here
        return null;
    }

}