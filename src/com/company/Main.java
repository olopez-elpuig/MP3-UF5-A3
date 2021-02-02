package com.company;

public class Main {

    public static void main(String[] args) {

        ReadCSV parser = new ReadCSV();
        MenuCSV menu = new MenuCSV();


        menu.start(parser.parse());

    }
}
