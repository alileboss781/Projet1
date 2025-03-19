import java.util.*;
//etape 5
public class Trajet {
    private Station stationDepart;
    private Station stationArrivee;
    private List<Ligne> lignesUtilisees;
    private List<Station> correspondances;

    public Trajet(Station stationDepart, Station stationArrivee, List<Ligne> lignesUtilisees, List<Station> correspondances) {
        this.stationDepart = stationDepart;
        this.stationArrivee = stationArrivee;
        this.lignesUtilisees = lignesUtilisees;
        this.correspondances = correspondances;
    }

    public String getDetailsItineraire() {
        StringBuilder details = new StringBuilder();
        details.append(" Itineraire de ").append(stationDepart.getNom()).append(" à ").append(stationArrivee.getNom()).append("\n");

        details.append("Lignes empruntee(s) :\n");
        for (Ligne ligne : lignesUtilisees) {
            details.append("- ").append(ligne.getNom()).append(" (").append(ligne.getTypeTransport()).append(")\n");
        }

        if (!correspondances.isEmpty()) {
            details.append("Correspondance(s) :\n");
            for (Station station : correspondances) {
                details.append("- ").append(station.getNom()).append("\n");
            }
        } else {
            details.append("Aucune correspondance requise.\n");
        }

        return details.toString();
    }
// etape 6
    public double calculerCout(TypePassager typePassager) {
        double tarifBase = 1.50;
        double coutTotal = tarifBase;

        for (Ligne ligne : lignesUtilisees) {
            double tarifParStation = switch (ligne.getTypeTransport().toLowerCase()) {
                case "métro" -> 0.40;
                case "tram" -> 0.30;
                case "bus" -> 0.20;
                default -> 0.0;
            };

            int nombreStations = ligne.getStations().size() - 1;
            coutTotal += nombreStations * tarifParStation;
        }

        return coutTotal * typePassager.getCoefficient();
    }

}

