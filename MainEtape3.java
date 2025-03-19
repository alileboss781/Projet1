import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Systemegestion gestion = new Systemegestion();

        // Création des stations avec détails et coordonnées géographiques correctes
        Station stationA = new Station("Ashford Road", 52.650219, 1.298729, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationB = new Station("Brookside Avenue", 52.647986, 1.285355, true, Arrays.asList("Distributeurs"));
        Station stationC = new Station("Castle Hill", 52.648781, 1.307894, false, Arrays.asList("Aucun service"));
        Station stationD = new Station("Dunham End", 52.648780, 1.276361, true, Arrays.asList("Guichet"));
        Station stationE = new Station("Eastbourne West", 52.646091, 1.287257, true, Arrays.asList("Distributeurs", "Toilettes"));
        Station stationF = new Station("Fairfields", 52.646091, 1.287257, false, Arrays.asList("Aucun service"));
        Station stationG = new Station("GrandCentral", 52.640381, 1.289051, true, Arrays.asList("Guichet", "Distributeurs", "Commerces"));
        Station stationH = new Station("Ivy Lane", 52.643648, 1.281168, true, Arrays.asList("Distributeurs"));
        Station stationJ = new Station("High Street", 52.643759, 1.305971, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationK = new Station("Market Square", 52.638825, 1.296614, true, Arrays.asList("Guichet", "Distributeurs", "Commerces"));
        Station stationN = new Station("Northgate Shopping Centre", 52.639920, 1.307381, true, Arrays.asList("Distributeurs", "Commerces"));
        Station stationP = new Station("Parkside Place", 52.638098, 1.273221, false, Arrays.asList("Aucun service"));
        Station stationQ = new Station("Queensbridge", 52.633614, 1.278604, true, Arrays.asList("Distributeurs"));
        Station stationR = new Station("Riverside", 52.632524, 1.273477, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationT = new Station("Town Hall", 52.637348, 1.288603, true, Arrays.asList("Distributeurs", "Toilettes"));
        Station stationU = new Station("Union Street", 52.633147, 1.295627, false, Arrays.asList("Aucun service"));
        Station stationW = new Station("Waterfront", 52.632563, 1.299113, true, Arrays.asList("Guichet", "Distributeurs"));
        Station stationX = new Station("Xenobiotics Research Centre", 52.635908, 1.306150, true, Arrays.asList("Distributeurs"));
        Station stationY = new Station("York Road", 52.635092, 1.269632, true, Arrays.asList("Guichet"));

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

        // Demande du nom de la station à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom de la station : ");
        String nomStation = scanner.nextLine();

        // Affichage des détails de la station
        gestion.afficherDetailsStation(nomStation);

        scanner.close();
    }
}