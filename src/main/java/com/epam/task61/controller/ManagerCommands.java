package com.epam.task61.controller;

public class ManagerCommands {
    private Command command;
    public ManagerCommands(Command command) {
        this.command = command;
    }
    public void execute() {
        command.execute();
    }
}
