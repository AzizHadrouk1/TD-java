import java.util.ArrayList;

public class Station {
    private int id;
    private String nom;
    private ArrayList<Vehicule> vehicules;

    // Constructeur par défaut
    public Station() {
        this.vehicules = new ArrayList<>();
    }

    // Constructeur paramétré
    public Station(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.vehicules = new ArrayList<>();
    }

    // Méthode ajouterVehicule
    public void ajouterVehicule(Vehicule vehicule) throws AjoutVoitureException {
        if (vehicules.size() >= 10) {
            throw new AjoutVoitureException("La station est pleine, impossible d'ajouter un nouveau véhicule.");
        }
        if (vehicules.contains(vehicule)) {
            throw new AjoutVoitureException("Le véhicule est déjà en cours de traitement.");
        }
        vehicules.add(vehicule);
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Station [id=" + id + ", nom=" + nom + ", vehicules=" + vehicules + "]";
    }

    // Méthode nbrVoitureEssence
    public int nbrVoitureEssence() {
        int count = 0;
        for (Vehicule v : vehicules) {
            if (v instanceof Voiture && "essence".equalsIgnoreCase(v.getTypeDeCarburant())) {
                count++;
            }
        }
        return count;
    }

    // Méthode nbrVoitureNoire
    public int nbrVoitureNoire() {
        int count = 0;
        for (Vehicule v : vehicules) {
            if (v instanceof Voiture && "noir".equalsIgnoreCase(((Voiture) v).getCouleur())) {
                count++;
            }
        }
        return count;
    }
}
