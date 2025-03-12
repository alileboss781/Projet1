public class Projet {
    public class Station {
        private String nom;            // Nom de la station
        private double latitude;       // Latitude GPS de la station
        private double longitude;      // Longitude GPS de la station

        // Constructeur
        public Station(String nom, double latitude, double longitude) {
            this.nom = nom;
            this.latitude = latitude;
            this.longitude = longitude;
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

        // Afficher les détails de la station
        public void afficherDetails() {
            System.out.println("Station: " + nom);
            System.out.println("Coordonnées GPS: (" + latitude + ", " + longitude + ")");
        }
    }

}
