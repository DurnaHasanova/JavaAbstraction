package Entities;

import java.text.DateFormat;
import java.util.Date;

public class Customer implements  IEntity {


    private int Id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationalityId;

    public int getId() {
        return Id;
    }

    public Customer setId(int id) {
        Id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Customer setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public Customer setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
        return this;
    }



}
