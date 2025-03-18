import java.util.*;

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
        details.append(" Itinéraire de ").append(stationDepart.getNom()).append(" à ").append(stationArrivee.getNom()).append("\n");

        details.append("Lignes empruntées :\n");
        for (Ligne ligne : lignesUtilisees) {
            details.append("- ").append(ligne.getNom()).append(" (").append(ligne.getTypeTransport()).append(")\n");
        }

        if (!correspondances.isEmpty()) {
            details.append("Correspondances :\n");
            for (Station station : correspondances) {
                details.append("- ").append(station.getNom()).append("\n");
            }
        } else {
            details.append("Aucune correspondance requise.\n");
        }

        return details.toString();
    }
}

