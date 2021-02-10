package uni.pl.fmi;

import java.util.*;

/**
 * 
 */
public class Teacher {

    /**
     * Default constructor
     */
    public Teacher() {
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
    public Subject Subject;


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
        // TODO implement here
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
        // TODO implement here
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
        // TODO implement here
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
        // TODO implement here
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
        // TODO implement here
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Set getGrades() {
        // TODO implement here
        return null;
    }

    /**
     * @param grades 
     * @return
     */
    public void setGrades(Set grades) {
        // TODO implement here
    }

    /**
     * @param grade 
     * @return
     */
    public void addGrades(Journal grade) {
        // TODO implement here
    }

}