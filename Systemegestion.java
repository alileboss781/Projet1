import java.util.ArrayList;
import java.util.List;

public class Systemegestion {
    private List<Station> stations;
    private List<Ligne> lignes;

    // Constructeur
    public Systemegestion() {
        stations = new ArrayList<>();
        lignes = new ArrayList<>();
    }

    public void Ajouterstation(Station station) {
        if (!stations.contains(station)) {
            stations.add(station);
        }
    }

    public void listerStations() {
        stations.sort((s1, s2) -> s1.getNom().compareTo(s2.getNom()));
        System.out.println("Stations (ordre alphabetique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    public void listerStationsInverse() {
        stations.sort((s1, s2) -> s2.getNom().compareTo(s1.getNom()));
        System.out.println("Stations (ordre inverse alphabetique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    public void AjouterLigne(Ligne ligne) {
        if (!lignes.contains(ligne)) {
            lignes.add(ligne);
        }
    }

    public void listerLignes() {
        lignes.sort((l1, l2) -> l1.getNom().compareTo(l2.getNom()));
        System.out.println("Lignes (ordre alphabetique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }

    public void listerLignesInverse() {
        lignes.sort((l1, l2) -> l2.getNom().compareTo(l1.getNom()));
        System.out.println("Lignes (ordre inverse alphabetique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }

    // Méthode pour afficher les détails d'une station par son nom
    public void afficherDetailsStation(String nomStation) {
        for (Station station : stations) {
            if (station.getNom().equalsIgnoreCase(nomStation)) {
                System.out.println(station.getDetailsStation());
                return; // On arrête après avoir trouvé la station
            }
        }
        System.out.println("Station non trouvée !");
    }

    public Station rechercherStationParNom(String nom) {
        for (Station station : stations) {
            if (station.getNom().equals(nom)) {
                return station;
            }
        }
        return null;
    }

    public Ligne rechercherLigneParNom(String nom) {
        for (Ligne ligne : lignes) {
            if (ligne.getNom().equals(nom)) {
                return ligne;
            }
        }
        return null;
    }
}