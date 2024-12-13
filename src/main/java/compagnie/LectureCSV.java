package compagnie;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureCSV {
    public static void main(String[] args) throws IOException {
        lireCSV();
    }

    public static void lireCSV() throws IOException {

        Reader in = new FileReader("C:\\Users\\nixon\\IdeaProjects\\Mini_projet\\Projet\\src\\main\\java\\compagnie\\vols.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(new String[]{"Code", "Dép", "Arriv", "Date", "Heure"})
                .setSkipHeaderRecord(true)
                .setDelimiter('|')
                .setIgnoreSurroundingSpaces(true)
                .build();

        Iterable<CSVRecord> records = csvFormat.parse(in);

        List<Map<String,String>> vols = new ArrayList<>();
        for (CSVRecord record : records) {
            Map<String,String> vol = new HashMap<>();
            vol.put("Code", record.get("Code"));
            vol.put("Dép", record.get("Dép"));
            vol.put("Arriv", record.get("Arriv"));
            vol.put("Date", record.get("Date"));
            vol.put("Heure", record.get("Heure"));
            vols.add(vol);
        }

        System.out.println(vols);
    }

}
