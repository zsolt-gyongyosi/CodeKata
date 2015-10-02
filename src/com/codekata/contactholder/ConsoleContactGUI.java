package com.codekata.contactholder;

import com.codekata.common.presenter.ConsoleGUI;

import java.util.List;

public class ConsoleContactGUI extends ConsoleGUI implements ContactGUI {

    public Contact ReadContact() {
        String FirstName = Read("FirstName");
        if (FirstName.isEmpty()) {
            Close();
            return null;
        }
        String LastName = Read("LastName");
        String PhoneNumber = Read("PhoneNumber");
        return new Contact(FirstName, LastName, PhoneNumber);
    }

    @Override
    public void ShowContactList(List<Contact> contacts) {
        for (Contact contact: contacts) {
            ShowContact(contact);
        }
        int count = contacts.size();
        Show("We have "+count+" contacts.");

    }

    @Override
    public void ShowContact(Contact contact) {
        String fmt = "%s, %s: %s";
        String s = String.format(fmt, contact.FirstName(), contact.LastName(), contact.PhoneNumber());
        Show(s);
    }

}
