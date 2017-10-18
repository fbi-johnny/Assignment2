package com.example.muhammadjohn.assn2;

/**
 * Created by Muhammad John on 17-Oct-17.
 */

public class Person {
    String id;
    String Name;
    String Contact;
    String email;


    Person(String Name, String Contact, String email, String id)
    {
        this.Name=Name;
        this.Contact=Contact;
        this.id=id;
        this.email=email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
