package canards;

public class CanardEau extends CanardDeCombat{
    private int pressionJet;

    public CanardEau(String nom, String prenom, int pvMax, int atck, int pressionJet) {
        super(nom, prenom, pvMax, atck);
        this.pressionJet = pressionJet;
    }

    public CanardEau(String nom, String prenom) {
        this(nom, prenom, 50, 13, 10);
    }

    @Override
    public String getType() {
        return "Eau";
    }

    @Override
    public String toString() {
        return super.toString() + " | Jet d'eau (pression: : " + pressionJet + ")";
    }
}
