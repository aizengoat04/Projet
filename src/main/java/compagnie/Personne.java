package compagnie;

public class Personne {
    private int identifiant;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(int identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }


    public String obtenirInfos() {
        return "Identifiant: " + identifiant + ", Nom: " + nom +
                ", Adresse: " + adresse + ", Contact: " + contact;
    }
}
