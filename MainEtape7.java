import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Systemegestion gestion = new Systemegestion();

        // Création des stations (avec coordonnées exactes)
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

        // Création des lignes
        Ligne millenium = new Ligne("Millenium", "Metro", Arrays.asList(stationA, stationB, stationC, stationE, stationG, stationK));
        Ligne heritage = new Ligne("Heritage", "Metro", Arrays.asList(stationJ, stationK, stationG, stationF));
        Ligne university = new Ligne("University", "Bus", Arrays.asList(stationJ, stationK, stationE));
        Ligne riverview = new Ligne("Riverview", "Bus", Arrays.asList(stationK, stationG, stationT));
        Ligne parkland = new Ligne("Parkland", "Tram", Arrays.asList(stationA, stationD));
        Ligne market = new Ligne("Market", "Tram", Arrays.asList(stationK, stationN));
        Ligne greenway = new Ligne("Greenway", "Bus", Arrays.asList(stationA, stationB));
        Ligne southernLoop = new Ligne("Southern Loop", "Bus", Arrays.asList(stationQ, stationR, stationY, stationP));

        // Ajout des lignes au Systemegestion
        gestion.AjouterLigne(millenium);
        gestion.AjouterLigne(heritage);
        gestion.AjouterLigne(university);
        gestion.AjouterLigne(riverview);
        gestion.AjouterLigne(parkland);
        gestion.AjouterLigne(market);
        gestion.AjouterLigne(greenway);
        gestion.AjouterLigne(southernLoop);

        // Demande du type de passager
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le type de passager (REGULIER, ETUDIANT, SENIOR, HANDICAPE) : ");
        String typePassagerStr = scanner.nextLine();

        TypePassager typePassager = null;
        try {
            typePassager = TypePassager.valueOf(typePassagerStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Type de passager invalide. Utilisation du tarif REGULIER par défaut.");
            typePassager = TypePassager.REGULIER;
        }

        // Demande du critère de recherche
        System.out.print("Entrez le critère de recherche (COUT, RAPIDITE, CORRESPONDANCES) : ");
        String critereStr = scanner.nextLine();

        Critere critere = null;
        try {
            critere = Critere.valueOf(critereStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Critère invalide. Utilisation de RAPIDITE par défaut.");
            critere = Critere.RAPIDITE;
        }

        // Demande des stations de départ et d'arrivée
        System.out.print("Entrez le nom de la station de depart : ");
        String nomDepart = scanner.nextLine();
        System.out.print("Entrez le nom de la station d'arrivee : ");
        String nomArrivee = scanner.nextLine();

        // Recherche de l'itinéraire et affichage des détails avec coût
        gestion.afficherDetailsItineraire(nomDepart, nomArrivee, critere, typePassager);

        scanner.close();
    }
}