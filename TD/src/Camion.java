public class Camion extends Vehicule {
    private int nbrPlace;

    // Constructeur
    public Camion(int id, String marque, String typeDeCarburant, int nbrPlace) {
        super(id, marque, typeDeCarburant);
        this.nbrPlace = nbrPlace;
    }

    // Getter et Setter pour nbrPlace (optionnel)
    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + ", nbrPlace=" + nbrPlace + "]";
    }
}
