import java.util.*;

public class RechercheItineraire {

    public static List<Station> trouverCheminBFS(GrapheTransport graphe, Station depart, Station arrivee) {
        Queue<List<Station>> queue = new LinkedList<>();
        Set<Station> visitees = new HashSet<>();

        queue.add(Collections.singletonList(depart));

        while (!queue.isEmpty()) {
            List<Station> chemin = queue.poll();
            Station dernier = chemin.get(chemin.size() - 1);

            if (dernier.equals(arrivee)) {
                return chemin;
            }

            if (!visitees.contains(dernier)) {
                visitees.add(dernier);
                for (Connexion c : graphe.getVoisins(dernier)) {
                    List<Station> nouveauChemin = new ArrayList<>(chemin);
                    nouveauChemin.add(c.getDestination());
                    queue.add(nouveauChemin);
                }
            }
        }
        return null;
    }

    public static List<Station> trouverCheminDijkstra(GrapheTransport graphe, Station depart, Station arrivee) {
        Map<Station, Integer> distances = new HashMap<>();
        Map<Station, Station> precedents = new HashMap<>();
        PriorityQueue<Station> file = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(depart, 0);
        file.add(depart);

        while (!file.isEmpty()) {
            Station actuel = file.poll();
            if (actuel.equals(arrivee)) break;

            for (Connexion c : graphe.getVoisins(actuel)) {
                int nouvelleDistance = distances.get(actuel) + c.getDuree();
                if (nouvelleDistance < distances.getOrDefault(c.getDestination(), Integer.MAX_VALUE)) {
                    distances.put(c.getDestination(), nouvelleDistance);
                    precedents.put(c.getDestination(), actuel);
                    file.add(c.getDestination());
                }
            }
        }

        List<Station> chemin = new ArrayList<>();
        for (Station at = arrivee; at != null; at = precedents.get(at)) {
            chemin.add(at);
        }
        Collections.reverse(chemin);
        return chemin.isEmpty() ? null : chemin;
    }

    public static List<Station> trouverCheminMoinsCher(GrapheTransport graphe, Station depart, Station arrivee) {
        Map<Station, Double> couts = new HashMap<>();
        Map<Station, Station> predecesseurs = new HashMap<>();
        PriorityQueue<Station> file = new PriorityQueue<>(Comparator.comparingDouble(couts::get));

        couts.put(depart, 0.0);
        file.add(depart);

        while (!file.isEmpty()) {
            Station actuelle = file.poll();
            if (actuelle.equals(arrivee)) break;

            for (Connexion voisin : graphe.getVoisins(actuelle)) {
                double coutLigne = switch (voisin.getLigne().getTypeTransport().toLowerCase()) {
                    case "métro" -> 0.40;
                    case "tram" -> 0.30;
                    case "bus" -> 0.20;
                    default -> 1.0;
                };

                double nouveauCout = couts.get(actuelle) + coutLigne;
                if (nouveauCout < couts.getOrDefault(voisin.getDestination(), Double.MAX_VALUE)) {
                    couts.put(voisin.getDestination(), nouveauCout);
                    predecesseurs.put(voisin.getDestination(), actuelle);
                    file.add(voisin.getDestination());
                }
            }
        }

        List<Station> chemin = new ArrayList<>();
        for (Station at = arrivee; at != null; at = predecesseurs.get(at)) {
            chemin.add(at);
        }
        Collections.reverse(chemin);
        return chemin.isEmpty() ? null : chemin;
    }

}
