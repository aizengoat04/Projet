package compagnie;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Création des personnes
        Pilote pilote = new Pilote(1, "Milaan", "Paris", "milaan@gmail.com", 1001, "2022-01-01", "P12345", 1500);
        PersonnelCabine cabine1 = new PersonnelCabine(2, "Minas", "Paris", "minas@gmail.com", 1002, "2023-03-15", "Chef de bord");
        PersonnelCabine cabine2 = new PersonnelCabine(3, "Manon", "Lyon", "manon@gmail.com", 1003, "2023-04-01", "Hôtesse");

        // Création des avions
        Avion avion = new Avion("F-ABCD", "Boeing 737", 180);

        // Création d'un aéroport
        Aeroport aeroport = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal de Paris");

        // Création des vols
        Vol vol1 = new Vol(101, "Paris", "New York", "2024-12-06 10:00", "2024-12-06 14:00");

        // Affectation d'un avion et de l'équipage
        avion.affecterVol(vol1);
        vol1.affecterVol(avion, pilote, Arrays.asList(cabine1, cabine2));

        // Affectation du vol à l'aéroport
        aeroport.affecterVol(vol1);

        // Création d'un passager et réservation
        Passager passager = new Passager(4, "Kevin", "Dubai", "kevin@gmail.com", "P987654");
        passager.reserverVol(vol1);

        // Affichage des informations
        System.out.println(aeroport);
        System.out.println(vol1.obtenirVol());
        System.out.println(pilote.obtenirInfos());
        System.out.println(passager.obtenirInfos());
    }
}
