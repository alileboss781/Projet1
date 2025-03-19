import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    static class Station {
        private String nom;

        public Station(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    static class SystemeGestion {
        private List<Station> stations;

        // Constructeur
        public SystemeGestion() {
            stations = new ArrayList<>();
        }

        // Ajouter une station
        public void AjouterStation(Station station) {
            stations.add(station);
        }

        // Lister toutes les stations dans l'ordre alphabétique croissant
        public void listerStations() {
            // Tri des stations par nom dans l'ordre alphabétique croissant
            stations.sort((s1, s2) -> s1.getNom().compareTo(s2.getNom())); // Tri ascendant
            System.out.println("Stations (ordre alphabetique) :");
            for (Station station : stations) {
                System.out.println(station.getNom());
            }
        }

        // Lister toutes les stations dans l'ordre alphabétique inverse
        public void listerStationsInverse() {
            // Tri des stations par nom dans l'ordre alphabétique inverse
            stations.sort((s1, s2) -> s2.getNom().compareTo(s1.getNom())); // Tri descendant
            System.out.println("Stations (ordre inverse alphabetique) :");
            for (Station station : stations) {
                System.out.println(station.getNom());
            }
        }
    }

    public static void main(String[] args) {
        SystemeGestion systeme = new SystemeGestion();

        // Ajouter les stations du plan
        String[] nomsStations = {
                "Ashford Road", "Brookside Avenue", "Castle Hill", "Dunham End", "Eastbourne West",
                "Fairfields", "GrandCentral", "High Street", "Ivy Lane", "Jubilee Place", "King's Way",
                "Lakeside", "Market Square", "Northgate Shopping Centre", "Oakwoods", "Parkside Place",
                "Queensbridge", "Riverside", "Southbank Place", "Town Hall", "Union Street",
                "Victoria Docks", "Waterfront", "Xenobiotics Research Centre", "York Road", "Zephyr Close"
        };

        for (String nom : nomsStations) {
            systeme.AjouterStation(new Station(nom));
        }

        // Demander à l'utilisateur quel ordre il veut
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un ordre pour afficher les stations :");
        System.out.println("1 - Ordre alphabetique");
        System.out.println("2 - Ordre inverse alphabetique");
        int choix = scanner.nextInt();

        // Afficher les stations selon le choix de l'utilisateur
        if (choix == 1) {
            systeme.listerStations();
        } else if (choix == 2) {
            systeme.listerStationsInverse();
        } else {
            System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
