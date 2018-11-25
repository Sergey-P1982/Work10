package com.epam.task61.controller;

import com.epam.task61.util.InputUtility;
import com.epam.task61.util.ResourceManager;
import com.epam.task61.view.BookView;

public class Controller {
    ResourceManager manager = ResourceManager.INSTANCE;
    private BookView view = new BookView();

    public void run() {
        while (true) {
            view.printMessage(manager.getMessage("mainMenu"));
            int number = InputUtility.inputInt(view, manager);
            CommandExecutor command = defineMenuItem(number);
            new ManagerCommands(command).execute();
        }
    }
    private CommandExecutor defineMenuItem(int number) {
        CommandExecutor[] itemMenus = CommandExecutor.values();
        if (number < 0 || number >= itemMenus.length) {
            return CommandExecutor.DEFAULT;
        }
        return itemMenus[number];
    }

}
