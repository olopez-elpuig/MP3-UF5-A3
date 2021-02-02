package com.company;

import java.util.Scanner;

public class MenuCSV {

    Scanner input = new Scanner(System.in);

    void start(CsvToBean<Nacimiento> naixementCsvToBean) {

        String menu = "";

        while (!(menu.equals("5"))){
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1. Nacimientos que empiecen por Les Corts");
            System.out.println("2. Nacimientos de El Fort Pienc");
            System.out.println("3. Nacimientos de paises que empiezan por E");
            System.out.println("4. Nacimientos de França");
            System.out.println("5. Sortir");

            menu = input.nextLine();
            CsvToBean<Nacimiento> llista = naixementCsvToBean;

            switch(menu){
                case "1":
                    llista.stream()
                            .filter(naixement -> naixement.getNom_Districte().contains("Les Corts"))
                            .forEach(System.out::println);
                    break;

                case "2":
                    llista.stream()
                            .filter(naixement -> naixement.getNom_Barri().equals("El Fort Pienc"))
                            .forEach(System.out::println);
                    break;

                case "3":
                    System.out.println(llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().equals("E"))
                            .forEach(System.out::println);
                    break;

                case "4":
                    llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().contains("França"))
                            .count());
                    break;

            }
        }
    }
}
