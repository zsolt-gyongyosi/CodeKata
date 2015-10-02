package com.codekata.contactholder;

import java.util.List;

public interface ContactGUI {
    boolean isReady();
    Contact ReadContact();
    void ShowContactList(List<Contact> contacts);
    void ShowContact(Contact contact);
}
