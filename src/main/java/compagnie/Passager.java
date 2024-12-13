package compagnie;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(int identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }


    public void reserverVol(Vol vol) {
        Reservation reservation = new Reservation(this, vol);
        reservations.add(reservation);
        System.out.println("Réservation effectuée pour le vol " + vol.getNumeroVol());
    }


    public void annulerReservation(int numeroReservation) {
        reservations.removeIf(reservation -> reservation.getNumeroReservation() == numeroReservation);
        System.out.println("Réservation annulée : " + numeroReservation);
    }


    public List<Reservation> obtenirReservations() {
        return reservations;
    }

    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() + ", Passeport: " + passeport;
    }
}
