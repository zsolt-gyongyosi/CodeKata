package com.codekata.contactholder;

public class Contact {
    public Contact(String FirstName, String LastName, String PhoneNumber) {
        entity.FirstName = FirstName;
        entity.LastName = LastName;
        entity.PhoneNumber = PhoneNumber;
    }
    public ContactEntity entity = new ContactEntity();

    public Contact(ContactEntity e) {
        entity = e;
    }

    public String FirstName() {
        return entity.FirstName;
    }

    public String LastName() {
        return entity.LastName;
    }

    public String PhoneNumber() {
        return entity.PhoneNumber;
    }
}
