import java.util.List;

public class Station {
    private String nom;            // Nom de la station
    private double latitude;       // Latitude GPS de la station
    private double longitude;      // Longitude GPS de la station
    private boolean accessibilite; // Accessibilité d'une station
    private List<String> services;        // services dans une station


    // Constructeur
    public Station(String nom, double latitude, double longitude, boolean accessibilite, List<String> services) {
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
        this.accessibilite= accessibilite;
        this.services=services;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isAccessibilite(){
        return accessibilite;
    }

    // Afficher les détails de la station
    public void afficherDetails() {
        System.out.println("Station: " + nom);
        System.out.println("Coordonnées GPS: (" + latitude + ", " + longitude + ")");
    }

    // Retourne les détails sous forme de texte
    public String getDetailsStation() {
        return "Station : " + nom +
                "\nServices : " + String.join(", ", services) +
                "\nAccessibilite : " + (accessibilite ? "Oui" : "Non") +
                "\nCoordonnees GPS : " + latitude + "," + longitude;
    }
}
