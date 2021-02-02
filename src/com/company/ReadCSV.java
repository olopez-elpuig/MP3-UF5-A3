package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadCSV {
    public static final String PATH = "https://opendata-ajuntament.barcelona.cat/data/dataset/cb293930-f483-4457-bf57-50a68e9b01b3/resource/8188d1b7-9dd8-4cc0-85b8-13c4b0b551e2/download/2019_naixements_lloc-de-naixement.csv";


    CsvToBean<Nacimiento> parse(){
        URL url = null;

        try {
            url = new URL(PATH);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader in = null;
        CSVReader reader = null;

        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            reader = new CSVReader(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CsvToBean<Nacimiento> naixementCsvToBean = new CsvToBeanBuilder(reader)
                .withType(Naixement.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        return naixementCsvToBean;
    }
}
}
