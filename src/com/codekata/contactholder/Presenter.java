package com.codekata.contactholder;


public class Presenter {
    private final ContactGUI gui;
    private final ContactHolder contactHolder;

    public Presenter(ContactGUI gui, ContactHolder contactHolder) {
        this.gui = gui;
        this.contactHolder = contactHolder;
    }

    public void invoke() {
        while (gui.isReady()) {
            gui.ShowContactList(contactHolder.List());
            contactHolder.Add(gui.ReadContact());
        }
    }

}
