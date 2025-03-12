import java.util.ArrayList;
import java.util.List;
public class Systemegestion {
    private List<Station> stations;        // Liste des stations

    // Constructeur
    public  void Creation(){
        stations = new ArrayList<>();
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


}
