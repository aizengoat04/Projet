package compagnie;

import java.util.ArrayList;
import java.util.List;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat; // Planifié, Annulé, etc.
    private Avion avion;
    private Pilote pilote;
    private List<PersonnelCabine> equipeCabine;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Planifié";
        this.equipeCabine = new ArrayList<>();
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void planifierVol() {
        this.etat = "Planifié";
    }

    public void annulerVol() {
        this.etat = "Annulé";
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }



    public void affecterVol(Avion avion, Pilote pilote, List<PersonnelCabine> equipeCabine) {
        this.avion = avion;
        this.pilote = pilote;
        this.equipeCabine = equipeCabine;
    }


    // Méthode pour obtenir des informations sur le vol
    public String obtenirVol() {
        return "Vol #" + numeroVol + " de " + origine + " à " + destination +
                ", Départ: " + dateHeureDepart + ", Arrivée: " + dateHeureArrivee +
                ", Etat: " + etat;
    }

}
