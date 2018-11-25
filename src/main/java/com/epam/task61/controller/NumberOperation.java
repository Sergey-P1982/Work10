package com.epam.task61.controller;

import com.epam.task61.service.ServiceBooks;
import com.epam.task61.util.InputUtility;
import com.epam.task61.util.ResourceManager;
import com.epam.task61.view.BookView;

public class NumberOperation {
    ResourceManager manager = ResourceManager.INSTANCE;
    private ServiceBooks serviceBooks = new ServiceBooks();
    private BookView view = new BookView();

    public void showAllBooks() {
        view.printMessage(manager.getMessage("listBooks"));
        view.printMessage(serviceBooks.showAllBooks());
    }
    public void findByAuthor() {
        view.printMessage(serviceBooks.searchBooksByAuthor(
                InputUtility.inputString(view, manager)));
    }
    public void findByPublisher() {
        view.printMessage(serviceBooks.searchBooksByPublisher(
                InputUtility.inputString(view, manager)));
    }
    public void findByYear() {
        view.printMessage(serviceBooks.searchBooksAfterYear(
                InputUtility.inputIntYear(view, manager)));
    }
    public void sortByPublish() {
        view.printMessage(
                manager.getMessage("SORTED_BOOKS"));
        view.printMessage(serviceBooks.sortByPublisher());
    }
    public void changeLanguage() {
        view.printMessage(
                manager.getMessage("LANGUAGE"));
        serviceBooks.changeLanguage(
                InputUtility.inputInt(view, manager));
    }
    public void defaultOperation() {
        view.printMessage(
                manager.getMessage("WRONG_INPUT_DATA"));
    }

    public void exit() {
        serviceBooks.saveBooks();
        System.exit(0);
    }

}
