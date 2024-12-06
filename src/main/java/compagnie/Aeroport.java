package compagnie;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<Vol> vols;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.vols = new ArrayList<>();
    }

    public void affecterVol(Vol vol) {
        vols.add(vol);
        System.out.println("Vol #" + vol.getNumeroVol() + " affecté à l'aéroport " + nom);
    }

    @Override
    public String toString() {
        return "Aéroport {Nom: " + nom + ", Ville: " + ville + ", Description: " + description + "}";
    }
}
