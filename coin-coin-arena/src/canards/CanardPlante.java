package canards;

public class CanardPlante extends CanardDeCombat{
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
            int pvRestores = (int) (getPvMax() * 0.1);
            setPvActuel(getPvActuel() + pvRestores);
    }
}
