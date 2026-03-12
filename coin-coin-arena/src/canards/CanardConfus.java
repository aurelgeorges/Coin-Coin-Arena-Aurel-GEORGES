package canards;

public class CanardConfus extends CanardEau {
    boolean enrage = false;

    public CanardConfus(String nom, String prenom, int pvMax, int atck, int pressionJet) {
        super(nom, prenom, pvMax, atck, pressionJet);
    }

    public CanardConfus(String nom, String prenom) {
        this(nom, prenom, 50, 13, 10);
    }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        if(enrage){
            mult *= 2.0;
            enrage = false;
        }

        if (Math.random() < 0.3) {
            int selfDamage = (int) (getAtck() * 0.5);
            setPvActuel(getPvActuels() - selfDamage);
            System.out.println(getNom() + " est confus ! Il se cogne la tête... Coin coin ?");
        } else {
            effectuerAttaque(cible, mult);
        }
    }

    public void migraine(){
        System.out.println(getNom() + " se tient la tête... COIN. COIN.");
        enrage = true;
    }

    @Override
    public String getType() {
        return "Confus";
    }
}
