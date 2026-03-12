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
    public double etreAttaqueePar(CanardFeu attaquant) {
        return 0.5;
    }

    @Override
    public double etreAttaqueePar(CanardEau attaquant) {
        return 0.5;
    }

    @Override
    public double etreAttaqueePar(CanardPlante attaquant) {
        return 2.0;
    }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        effectuerAttaque(cible, mult);
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
