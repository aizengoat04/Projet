package compagnie;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class EcrireCSV {
    public static void main(String[] args) {
        try {
            ecrireCSV();
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }

    public static void ecrireCSV() throws IOException {
        String filePath = "C:\\Users\\nixon\\IdeaProjects\\Mini_projet\\Projet\\src\\main\\java\\compagnie\\Passager.csv";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
             CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .builder()
                     .setHeader("Passeport", "Nom", "Prenom", "CodeVol")
                     .setDelimiter('|')
                     .build())) {


            printer.printRecord(Arrays.asList("N012J14", "Lemont", "Paul", "TO3530"));
            printer.printRecord(Arrays.asList("AJ09090", "Martin", "Sarah", "TO1100"));
            printer.printRecord(Arrays.asList("PL110211", "Dubois", "Carl", "TO3232"));
            printer.printRecord(Arrays.asList("WQ1989", "Petit", "Adam", "TO5656"));
        }

        System.out.println("Fichier Passager.csv créé et écrit avec succès.");
    }
}
