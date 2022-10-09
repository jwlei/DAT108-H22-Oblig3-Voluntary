package ex3.initializer.task2;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

    @NotNull
    @Size(min = 3, max = 30, message="First name must be between 3 and 30 characters")
    String fname;

    @NotNull
    @Size(min = 3, max = 30, message="Last name must be between 3 and 30 characters")
    String lname;

    @NotNull(message="Year must be something")
    int year;

    @NotNull
    @Pattern(regexp = "^[0-9]{4}$", message="Area code must be 4 digits")
    String areaCode;

    @NotNull
    @Pattern(regexp = "^[0-9]{8}$", message="Phone number must be 8 digits")
    String phone;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message="Email must be valid")
    String email;


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [areaCode=" + areaCode + ", email=" + email + ", fname=" + fname + ", lname=" + lname + ", phone="
                + phone + ", year=" + year + "]";
    }
}

