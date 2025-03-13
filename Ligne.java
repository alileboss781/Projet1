import java.util.List;

public class Ligne {
    private String nom;                  // Nom de la ligne (ex: Ligne 1)
    private String typeTransport;         // Type de transport (ex: Métro, Tram, Bus)
    private List<Station> stations;       // Liste des stations de la ligne

    // Constructeur
    public Ligne(String nom, String typeTransport, List<Station> stations) {
        this.nom = nom;
        this.typeTransport = typeTransport;
        this.stations = stations;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    // Afficher les détails de la ligne
    public void afficherDetails() {
        System.out.println("Ligne: " + nom + " (" + typeTransport + ")");
        System.out.println("Stations : ");
        for (Station station : stations) {
            System.out.println("- " + station.getNom());
        }
    }
}
