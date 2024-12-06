package compagnie;

public class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé (Numéro: " + numeroEmploye + ")";
    }

    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() + ", Numéro Employé: " + numeroEmploye +
                ", Date d'embauche: " + dateEmbauche;
    }
}

