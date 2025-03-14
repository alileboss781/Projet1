public class Voisin {
    public Station station;
    public Ligne ligne;
    public int poids; // Temps de trajet en minutes

    public Voisin(Station station, Ligne ligne, int poids) {
        this.station = station;
        this.ligne = ligne;
        this.poids = poids;
    }
}
