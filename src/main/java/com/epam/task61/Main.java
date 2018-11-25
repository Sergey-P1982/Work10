package com.epam.task61;

import com.epam.task61.controller.Controller;

public class Main {

    public static void main(String[] args) {
        new Controller().run();
    }
}

// OUTPUT:
//        1. Show all books
//        2. Find by author
//        3. Find by publisher
//        4. Find books published after specified year
//        5. Sort books by publisher
//        6. Change languare
//        0. Exit
//        Choice operation:
//        4
//        Choice operation:
//        1234
//        Incorrect input.
//        Choice operation:
//        2009
//        Books after year ->2009
//        author:Shevchenko      titul:Book 1                    publish:ABABAGALAMAGA   year:2010  pages:100   cost:150,00
//        author:WWW consortium  titul:CSS                       publish:Odessa          year:2018  pages:333   cost:26,00
//        author:WWW consortium  titul:JavaScript                publish:Lviv            year:2011  pages:726   cost:86,00
//        author:Herbert Shild   titul:Python                    publish:Lviv            year:2011  pages:376   cost:86,00
//        author:Shevchenko      titul:Title1                    publish:BXV             year:2010  pages:320   cost:450,00
//        author:Maslov          titul:Title4                    publish:Piter           year:2016  pages:555   cost:620,50
//        author:Sokolov         titul:Title5                    publish:Piter           year:2011  pages:876   cost:555,50
//        author:Petrov          titul:Title7                    publish:Word            year:2018  pages:276   cost:155,50
//        author:Shevchenko      titul:Title8                    publish:Piter           year:2013  pages:456   cost:100,00
//
//        1. Show all books
//        2. Find by author
//        3. Find by publisher
//        4. Find books published after specified year
//        5. Sort books by publisher
//        6. Change languare
//        0. Exit
//        Choice operation:
//        6
//        1) eng
//        2) rus
//        3) ukn
//        Choice operation:
//        2
//        1. Показать все книги
//        2. Найти по автору
//        3. Найти по издательству
//        4. Найти книги, опубликованные после указанного года
//        5. Сортировка книг по издательству
//        6. Изменить язык
//        0. Выход
//        Операция выбора выбора:
//        2
//        Введите строку:
//        Shevchenko
//        Книги с автором ->Shevchenko
//        author:Shevchenko      titul:Book 1                    publish:ABABAGALAMAGA   year:2010  pages:100   cost:150,00
//        author:Shevchenko      titul:Title1                    publish:BXV             year:2010  pages:320   cost:450,00
//        author:Shevchenko      titul:Title2                    publish:Word            year:2000  pages:120   cost:250,00
//        author:Shevchenko      titul:Title8                    publish:Piter           year:2013  pages:456   cost:100,00
//
//        1. Показать все книги
//        2. Найти по автору
//        3. Найти по издательству
//        4. Найти книги, опубликованные после указанного года
//        5. Сортировка книг по издательству
//        6. Изменить язык
//        0. Выход
//        Операция выбора выбора:
//        6
//        1) eng
//        2) rus
//        3) ukr
//        Операция выбора выбора:
//        3
//        1. Показати усі книги
//        2. Знайдіть за автором
//        3. Знайти за видавцем
//        4. Знайти книги, опубліковані після зазначеного року
//        5. Сортувати книги за видавцем
//        6. Зміна мови
//        0. Вихід
//        Вибір операції:
//        5
//        сортовані книги за видавцем:
//        author:Shevchenko      titul:Book 1                    publish:ABABAGALAMAGA   year:2010  pages:100   cost:150,00
//        author:Shevchenko      titul:Title1                    publish:BXV             year:2010  pages:320   cost:450,00
//        author:Sokolov         titul:Title3                    publish:BXV             year:1999  pages:820   cost:1050,00
//        author:Alexandrov      titul:Title6                    publish:BXV             year:2001  pages:400   cost:300,00
//        author:Lenin           titul:Java                      publish:Kharkiv         year:2008  pages:150   cost:40,00
//        author:WWW consortium  titul:HTML                      publish:Kyiv            year:2001  pages:130   cost:225,00
//        author:WWW consortium  titul:JavaScript                publish:Lviv            year:2011  pages:726   cost:86,00
//        author:Herbert Shild   titul:Python                    publish:Lviv            year:2011  pages:376   cost:86,00
//        author:WWW consortium  titul:CSS                       publish:Odessa          year:2018  pages:333   cost:26,00
//        author:Maslov          titul:Title4                    publish:Piter           year:2016  pages:555   cost:620,50
//        author:Sokolov         titul:Title5                    publish:Piter           year:2011  pages:876   cost:555,50
//        author:Shevchenko      titul:Title8                    publish:Piter           year:2013  pages:456   cost:100,00
//        author:Shevchenko      titul:Title2                    publish:Word            year:2000  pages:120   cost:250,00
//        author:Petrov          titul:Title7                    publish:Word            year:2018  pages:276   cost:155,50
//
//        1. Показати усі книги
//        2. Знайдіть за автором
//        3. Знайти за видавцем
//        4. Знайти книги, опубліковані після зазначеного року
//        5. Сортувати книги за видавцем
//        6. Зміна мови
//        0. Вихід
//        Вибір операції:
//        0
//
//        Process finished with exit code 0