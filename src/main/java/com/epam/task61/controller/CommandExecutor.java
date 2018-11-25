package com.epam.task61.controller;

public enum CommandExecutor implements Command {
    EXIT {
        @Override
        public void execute() {
            operation.exit();
        }

    },
    SHOW_BOOKS {
        @Override
        public void execute() {
            operation.showAllBooks();
        }

    },
    FIND_AUTHOR {
        @Override
        public void execute() {
            operation.findByAuthor();
        }

    },
    FIND_PUBLISH {
        @Override
        public void execute() {
            operation.findByPublisher();
        }

    },

    FIND_YEAR {
        @Override
        public void execute() {
            operation.findByYear();
        }

    },
    SORT_PUBLISH {
        @Override
        public void execute() {
            operation.sortByPublish();
        }

    },
    LANG {
        @Override
        public void execute() {
            operation.changeLanguage();
        }

    }, DEFAULT {
        @Override
        public void execute() {
            operation.defaultOperation();
        }

    };
    NumberOperation operation = new NumberOperation();

}

