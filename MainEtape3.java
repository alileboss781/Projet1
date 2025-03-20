import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Systemegestion gestion = new Systemegestion();

        // Création des stations avec détails
        Station stationA = new Station("Ashford Road", 48.8566, 2.3522, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationB = new Station("Brookside Avenue", 48.8570, 2.3525, true, Arrays.asList("Distributeurs"));
        Station stationC = new Station("Castle Hill", 48.8575, 2.3530, false, Arrays.asList("Aucun service"));
        Station stationD = new Station("Dunham End", 48.8580, 2.3535, true, Arrays.asList("Guichet"));
        Station stationE = new Station("Eastbourne West", 48.8585, 2.3540, true, Arrays.asList("Distributeurs", "Toilettes"));
        Station stationF = new Station("Fairfields", 52.644776, 1.290910, false, Arrays.asList("Aucun service"));
        Station stationG = new Station("GrandCentral", 48.8595, 2.3550, true, Arrays.asList("Guichet", "Distributeurs", "Commerces"));
        Station stationH = new Station("High Street", 48.8605, 2.3560, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationJ = new Station("Market Square", 48.8610, 2.3565, true, Arrays.asList("Guichet", "Distributeurs", "Commerces")); // Renommée depuis Market Place
        Station stationK = new Station("Northgate Shopping Centre", 48.8615, 2.3570, true, Arrays.asList("Distributeurs", "Commerces"));
        Station stationN = new Station("Northgate Shopping Centre", 52.639920, 1.307381, true, Arrays.asList("Distributeurs", "Commerces")); // Coordonnées mises à jour
        Station stationP = new Station("Parkside Place", 48.8625, 2.3580, false, Arrays.asList("Aucun service"));
        Station stationQ = new Station("Queensbridge", 48.8630, 2.3585, true, Arrays.asList("Distributeurs"));
        Station stationR = new Station("Riverside", 48.8635, 2.3590, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationT = new Station("Town Hall", 48.8640, 2.3595, true, Arrays.asList("Distributeurs", "Toilettes"));
        Station stationU = new Station("Union Street", 48.8645, 2.3600, false, Arrays.asList("Aucun service"));
        Station stationW = new Station("Waterfront", 48.8650, 2.3605, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationX = new Station("Xenobiotics Research Centre", 48.8655, 2.3610, true, Arrays.asList("Distributeurs"));
        Station stationY = new Station("York Road", 48.8660, 2.3615, true, Arrays.asList("Guichet"));
        Station stationL = new Station("Lakeside", 52.644776, 1.300267, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour
        Station stationM = new Station("Market Square", 52.638825, 1.296614, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour et renommée
        Station stationO = new Station("Oakwoods", 52.637931, 1.282890, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour
        Station stationI = new Station("Ivy Lane", 52.643648, 1.281168, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour
        Station stationS = new Station("Southbank Place", 0, 0, true, Arrays.asList("Distributeurs")); // Coordonnées à définir
        Station stationV = new Station("Victoria Docks", 52.635325, 1.300011, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour
        Station stationZ = new Station("Zephyr Close", 52.651503, 1.280014, true, Arrays.asList("Distributeurs")); // Coordonnées mises à jour

        // Ajout des stations au Systemegestion
        gestion.Ajouterstation(stationA);
        gestion.Ajouterstation(stationB);
        gestion.Ajouterstation(stationC);
        gestion.Ajouterstation(stationD);
        gestion.Ajouterstation(stationE);
        gestion.Ajouterstation(stationF);
        gestion.Ajouterstation(stationG);
        gestion.Ajouterstation(stationH);
        gestion.Ajouterstation(stationJ);
        gestion.Ajouterstation(stationK);
        gestion.Ajouterstation(stationN);
        gestion.Ajouterstation(stationP);
        gestion.Ajouterstation(stationQ);
        gestion.Ajouterstation(stationR);
        gestion.Ajouterstation(stationT);
        gestion.Ajouterstation(stationU);
        gestion.Ajouterstation(stationW);
        gestion.Ajouterstation(stationX);
        gestion.Ajouterstation(stationY);
        gestion.Ajouterstation(stationL);
        gestion.Ajouterstation(stationM);
        gestion.Ajouterstation(stationO);
        gestion.Ajouterstation(stationI);
        gestion.Ajouterstation(stationS);
        gestion.Ajouterstation(stationV);
        gestion.Ajouterstation(stationZ);



        // Demande du nom de la station à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom de la station : ");
        String nomStation = scanner.nextLine();

        // Affichage des détails de la station
        gestion.afficherDetailsStation(nomStation);

        scanner.close();
    }
}