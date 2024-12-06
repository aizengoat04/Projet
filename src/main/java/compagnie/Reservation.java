package compagnie;

public class Reservation {
    private static int compteurReservation = 1;
    private int numeroReservation;
    private Passager passager;
    private Vol vol;
    private String dateReservation;
    private String statut; // Confirmé, Annulé, etc.

    public Reservation(Passager passager, Vol vol) {
        this.numeroReservation = compteurReservation++;
        this.passager = passager;
        this.vol = vol;
        this.dateReservation = java.time.LocalDate.now().toString();
        this.statut = "Confirmé";
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public Vol getVol() {
        return vol;
    }

    public String getStatut() {
        return statut;
    }

    public void modifierStatut(String nouveauStatut) {
        this.statut = nouveauStatut;
    }

    @Override
    public String toString() {
        return "Réservation #" + numeroReservation + ", Vol: " + vol.getNumeroVol() +
                ", Date: " + dateReservation + ", Statut: " + statut;
    }
}
