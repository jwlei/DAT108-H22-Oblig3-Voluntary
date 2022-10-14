package ex3.initializer.task3;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    /**
     * We grab the custom error messages to show in <spring:message code=""/> in the jsp
     * The messages are stored in the message.proprties file
     */

    @NotNull
    @Size(min = 3, max = 30, message="Name must be between 3 and 30 characters")
    String fname;

    @NotNull
    @Size(min = 3, max = 30, message="Name must be between 3 and 30 characters")
    String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Person() {

    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}

