package compagnie;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private List<Vol> volsProgrammes;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.volsProgrammes = new ArrayList<>();
    }

    public boolean verifierDisponibilite(String dateHeureDepart, String dateHeureArrivee) {
        for (Vol vol : volsProgrammes) {
            if (vol.getDateHeureDepart().equals(dateHeureDepart) ||
                    vol.getDateHeureArrivee().equals(dateHeureArrivee)) {
                return false;
            }
        }
        return true;
    }

    public void affecterVol(Vol vol) {
        if (verifierDisponibilite(vol.getDateHeureDepart(), vol.getDateHeureArrivee())) {
            volsProgrammes.add(vol);
            System.out.println("Vol affecté à l'avion : " + immatriculation);
        } else {
            System.out.println("Avion indisponible pour ce créneau.");
        }
    }

    @Override
    public String toString() {
        return "Avion {Immatriculation: " + immatriculation + ", Modèle: " + modele +
                ", Capacité: " + capacite + "}";
    }
}
