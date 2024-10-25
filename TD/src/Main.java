public class Main {
    public static void main(String[] args) {
        // Création d'une station de lavage
        Station station = new Station(1, "Station de lavage A");

        // Création de véhicules
        Voiture voiture1 = new Voiture(101, "Toyota", "essence", "noir");
        Voiture voiture2 = new Voiture(102, "Honda", "diesel", "blanc");
        Voiture voiture3 = new Voiture(103, "Ford", "essence", "noir");
        Camion camion1 = new Camion(201, "Mercedes", "diesel", 2);

        try {
            // Ajout des véhicules à la station
            station.ajouterVehicule(voiture1);
            station.ajouterVehicule(voiture2);
            station.ajouterVehicule(voiture3);
            station.ajouterVehicule(camion1);

            // Affichage de la station et de ses véhicules
            System.out.println(station);

            // Calcul et affichage du nombre de voitures essence
            int nbrVoituresEssence = station.nbrVoitureEssence();
            System.out.println("Nombre de voitures essence en cours de traitement : " + nbrVoituresEssence);

            // Calcul et affichage du nombre de voitures noires
            int nbrVoituresNoires = station.nbrVoitureNoire();
            System.out.println("Nombre de voitures noires en cours de traitement : " + nbrVoituresNoires);

        } catch (AjoutVoitureException e) {
            // Gestion des exceptions lors de l'ajout de véhicules
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
