package uni.pl.fmi;

import java.util.*;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Set<Teacher> Teacher;


    /**
     * 
     */
    public Journal journal;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

}