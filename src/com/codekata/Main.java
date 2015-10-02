package com.codekata;

import com.codekata.common.repository.MemoryRepository;
import com.codekata.common.repository.Repository;
import com.codekata.contactholder.*;

public class Main {

    public static void main(String[] args) {
        Repository<ContactEntity> repository = new MemoryRepository<ContactEntity>();
        ContactHolder contactHolder = new ContactHolder(repository);
        ContactGUI gui = new ConsoleContactGUI();
        Presenter presenter = new Presenter(gui, contactHolder);
        presenter.invoke();
    }
}
