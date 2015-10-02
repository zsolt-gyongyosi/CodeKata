package com.codekata.common.presenter;

import java.util.Scanner;

public class ConsoleGUI implements TextGUI {
    private boolean ready = true;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String Read(String prompt) {
        if (!ready) return "";
        System.out.print(prompt+": ");
        return scanner.nextLine();
    }

    @Override
    public void Show(String line) {
        if (!ready) return;
        System.out.println(line);
    }

    public boolean isReady() {
        return ready;
    }

    protected void Close() {
        ready = false;
    }
}
