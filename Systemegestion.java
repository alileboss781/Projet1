import java.util.*;

public class Systemegestion {
    private List<Station> stations;
    private List<Ligne> lignes;
    private GrapheTransport graphe; //  Ajout du graphe pour gérer les connexions

    // Constructeur
    public Systemegestion() {
        stations = new ArrayList<>();
        lignes = new ArrayList<>();
        graphe = new GrapheTransport();
    }

    public void Ajouterstation(Station station) {
        if (!stations.contains(station)) {
            stations.add(station);
            graphe.ajouterStation(station); // Ajouter la station au graphe
        }
    }

    public void AjouterLigne(Ligne ligne) {
        if (!lignes.contains(ligne)) {
            lignes.add(ligne);
            List<Station> stationsLigne = ligne.getStations();

            //  Ajout des connexions dans le graphe
            for (int i = 0; i < stationsLigne.size() - 1; i++) {
                graphe.ajouterConnexion(stationsLigne.get(i), stationsLigne.get(i + 1), ligne, 5);
            }
        }
    }

    public void listerStations() {
        stations.sort(Comparator.comparing(Station::getNom));
        System.out.println("Stations (ordre alphabétique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    public void listerStationsInverse() {
        stations.sort(Comparator.comparing(Station::getNom).reversed());
        System.out.println("Stations (ordre inverse alphabétique) :");
        for (Station station : stations) {
            System.out.println(station.getNom());
        }
    }

    public void listerLignes() {
        lignes.sort(Comparator.comparing(Ligne::getNom));
        System.out.println("Lignes (ordre alphabétique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }

    public void listerLignesInverse() {
        lignes.sort(Comparator.comparing(Ligne::getNom).reversed());
        System.out.println("Lignes (ordre inverse alphabétique) :");
        for (Ligne ligne : lignes) {
            System.out.println(ligne.getNom() + " - " + ligne.getTypeTransport());
        }
    }

    // Méthode pour afficher les détails d'une station par son nom

    public void afficherDetailsStation(String nomStation) {
        for (Station station : stations) {
            if (station.getNom().equalsIgnoreCase(nomStation)) {
                System.out.println(station.getDetailsStation());
                return;
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


     // Recherche d'itinéraire
    public void rechercherItineraire(String nomDepart, String nomArrivee, boolean optimiserTemps) {
        Station depart = rechercherStationParNom(nomDepart);
        Station arrivee = rechercherStationParNom(nomArrivee);

        if (depart == null || arrivee == null) {
            System.out.println("Station introuvable !");
            return;
        }

        List<Station> chemin = optimiserTemps
                ? RechercheItineraire.trouverCheminDijkstra(graphe, depart, arrivee)
                : RechercheItineraire.trouverCheminBFS(graphe, depart, arrivee);

        if (chemin != null) {
            System.out.println("Itinéraire trouvé :");
            for (Station s : chemin) {
                System.out.println("- " + s.getNom());
            }
        } else {
            System.out.println("Aucun itinéraire trouvé.");
        }
    }
          // étape 5

    public void afficherDetailsItineraire(String nomDepart, String nomArrivee, boolean optimiserTemps) {
        Station depart = rechercherStationParNom(nomDepart);
        Station arrivee = rechercherStationParNom(nomArrivee);

        if (depart == null || arrivee == null) {
            System.out.println(" Station introuvable !");
            return;
        }

        List<Station> chemin = optimiserTemps
                ? RechercheItineraire.trouverCheminDijkstra(graphe, depart, arrivee)
                : RechercheItineraire.trouverCheminBFS(graphe, depart, arrivee);

        if (chemin == null) {
            System.out.println(" Aucun itinéraire trouvé.");
            return;
        }

        List<Ligne> lignesUtilisees = new ArrayList<>();
        List<Station> correspondances = new ArrayList<>();

        // Identifier les lignes utilisées et les correspondances
        for (int i = 0; i < chemin.size() - 1; i++) {
            Station actuelle = chemin.get(i);
            Station suivante = chemin.get(i + 1);

            Ligne ligneCommune = trouverLigneCommune(actuelle, suivante);
            if (ligneCommune != null) {
                if (!lignesUtilisees.contains(ligneCommune)) {
                    lignesUtilisees.add(ligneCommune);
                    if (i > 0) {
                        correspondances.add(actuelle);
                    }
                }
            }
        }

        // Création du trajet et affichage des détails
        Trajet trajet = new Trajet(depart, arrivee, lignesUtilisees, correspondances);
        System.out.println(trajet.getDetailsItineraire());
    }

    // Méthode pour trouver la ligne commune entre deux stations
    private Ligne trouverLigneCommune(Station s1, Station s2) {
        for (Ligne ligne : lignes) {
            if (ligne.getStations().contains(s1) && ligne.getStations().contains(s2)) {
                return ligne;
            }
        }
        return null;
    }


}


