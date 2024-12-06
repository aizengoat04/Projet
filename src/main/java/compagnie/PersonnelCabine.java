package compagnie;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(int identifiant, String nom, String adresse, String contact, int numeroEmploye,
                           String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine (Qualification: " + qualification + ")";
    }

    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() + ", Qualification: " + qualification;
    }
}
