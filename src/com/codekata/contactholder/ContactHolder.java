package com.codekata.contactholder;

import com.codekata.common.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class ContactHolder implements ContactAdder, ContactLister {

    private final Repository<ContactEntity> repository;

    public ContactHolder(Repository<ContactEntity> repository) {
        this.repository = repository;
    }

    @Override
    public void Add(Contact contact) {
        if (contact != null) {
            repository.add(contact.entity);
        }
    }

    @Override
    public List<Contact> List() {
        List<Contact> l = new ArrayList<Contact>();
        for (ContactEntity r : repository) {
            l.add(new Contact(r));
        }
        return l;
    }
}
