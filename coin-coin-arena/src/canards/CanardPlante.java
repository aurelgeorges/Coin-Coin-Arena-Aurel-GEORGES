package canards;

public class CanardPlante extends CanardDeCombat {

    public CanardPlante(String nom, String prenom, int pvMax, int atck) {
        super(nom, prenom, pvMax, atck);
    }

    public CanardPlante(String nom, String prenom) {
        this(nom, prenom, 50, 13);
    }

    @Override
    public String getType() {
        return "Plante";
    }

    public void regenerer() {
        int pvRestores = (int) (getPvMax() * 0.2);
        setPvActuel(getPvActuels() + pvRestores);
    }

    @Override
    public double etreAttaqueePar(CanardFeu attaquant) {
        return 2.0;
    }

    @Override
    public double etreAttaqueePar(CanardEau attaquant) {
        return 0.5;
    }

    @Override
    public double etreAttaqueePar(CanardPlante attaquant) {
        return 0.5;
    }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        effectuerAttaque(cible, mult);
    }
}
