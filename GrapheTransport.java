import java.util.*;

public class GrapheTransport {
    private Map<Station, List<Connexion>> adjacence;

    public GrapheTransport() {
        adjacence = new HashMap<>();
    }

    public void ajouterStation(Station station) {
        adjacence.putIfAbsent(station, new ArrayList<>());
    }

    public void ajouterConnexion(Station depart, Station arrivee, Ligne ligne, int duree) {
        adjacence.get(depart).add(new Connexion(arrivee, ligne, duree));
        adjacence.get(arrivee).add(new Connexion(depart, ligne, duree)); // Connexion bidirectionnelle
    }

    public List<Connexion> getVoisins(Station station) {
        return adjacence.getOrDefault(station, new ArrayList<>());
    }
}

class Connexion {
    private Station destination;
    private Ligne ligne;
    private int duree;

    public Connexion(Station destination, Ligne ligne, int duree) {
        this.destination = destination;
        this.ligne = ligne;
        this.duree = duree;
    }

    public Station getDestination() {
        return destination;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public int getDuree() {
        return duree;
    }
}
