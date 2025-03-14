import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Création du Systemegestion
        Systemegestion gestion = new Systemegestion();

        // Création des stations
        Station stationA = new Station("Ashford Road", 48.8566, 2.3522);
        Station stationB = new Station("Brookside Avenue", 48.8570, 2.3525);
        Station stationC = new Station("Castle Hill", 48.8575, 2.3530);
        Station stationD = new Station("Dunham End", 48.8580, 2.3535);
        Station stationE = new Station("Eastbourne West", 48.8585, 2.3540);
        Station stationF = new Station("Fairfields", 48.8590, 2.3545);
        Station stationG = new Station("GrandCentral", 48.8595, 2.3550);
        Station stationH = new Station("Ivy Lane", 48.8600, 2.3555);
        Station stationJ = new Station("High Street", 48.8605, 2.3560);
        Station stationK = new Station("Market Square", 48.8610, 2.3565);
        Station stationN = new Station("Northgate Shopping Centre", 48.8615, 2.3570);
        Station stationP = new Station("Parkside Place", 48.8625, 2.3580);
        Station stationQ = new Station("Queensbridge", 48.8630, 2.3585);
        Station stationR = new Station("Riverside", 48.8635, 2.3590);
        Station stationT = new Station("Town Hall", 48.8640, 2.3595);
        Station stationU = new Station("Union Street", 48.8645, 2.3600);
        Station stationW = new Station("Waterfront", 48.8650, 2.3605);
        Station stationX = new Station("Xenobiotics Research Centre", 48.8655, 2.3610);
        Station stationY = new Station("York Road", 48.8660, 2.3615);

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

        // Affichage des informations des lignes
        gestion.listerLignes();

        // Affichage des stations de chaque ligne
        millenium.afficherDetails();
        heritage.afficherDetails();
        university.afficherDetails();
        riverview.afficherDetails();
        parkland.afficherDetails();
        market.afficherDetails();
        greenway.afficherDetails();
        southernLoop.afficherDetails();
    }
}