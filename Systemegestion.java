import java.util.ArrayList;
import java.util.List;
public class Systemegestion {
    private List<Station> stations;        // Liste des stations
    private List<Ligne> lignes;        // Liste des lignes

    // Constructeur
    public  void Creation(){
        stations = new ArrayList<>();
        lignes= new ArrayList<>();
    }

    //Ajouter une station

    public void Ajouterstation( Station station){
        stations.add(station);
    }

    // Lister toutes les stations dans l'ordre alphabétique croissant
    public void listerStations() {
        // Tri des stations par nom dans l'ordre alphabétique croissant
        stations.sort((s1, s2) -> s1.getNom().compareTo(s2.getNom())); // Tri ascendant
        System.out.println("Stations (ordre alphabétique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    // Lister toutes les stations dans l'ordre alphabétique inverse
    public void listerStationsInverse() {
        // Tri des stations par nom dans l'ordre alphabétique inverse
        stations.sort((s1, s2) -> s2.getNom().compareTo(s1.getNom())); // Tri descendant
        System.out.println("Stations (ordre inverse alphabétique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    // Ajouter une ligne
    public void AjouterLigne(Ligne ligne){
        lignes.add(ligne);
    }

    //Lister les lignes dans l'ordre alphabétique

    // Lister toutes les lignes dans l'ordre alphabétique croissant
    public void listerLignes() {
        lignes.sort((l1, l2) -> l1.getNom().compareTo(l2.getNom())); // Tri ascendant
        System.out.println("Lignes (ordre alphabétique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }

    // Lister toutes les lignes dans l'ordre alphabétique inverse
    public void listerLignesInverse() {
        lignes.sort((l1, l2) -> l2.getNom().compareTo(l1.getNom())); // Tri descendant
        System.out.println("Lignes (ordre inverse alphabétique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }
}
