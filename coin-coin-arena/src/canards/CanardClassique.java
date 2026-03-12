package canards;

public class CanardClassique extends CanardDeCombat{
    public CanardClassique(String nom, String prenom, int pvMax, int atck) {
        super(nom, prenom, pvMax, atck);
    }

    public CanardClassique(String nom, String prenom) {
        this(nom, prenom, 50, 13);
    }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        effectuerAttaque(cible, mult);
    }

    @Override
    public String getType() {
        return "Normal";
    }

}
