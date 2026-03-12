package canards;

public class CanardFeu extends CanardDeCombat{
    private double intensiteFlamme;


    public CanardFeu(String nom, String prenom, int pvMax, int atck, double intensiteFlamme) {
        super(nom, prenom, pvMax, atck);
        if(intensiteFlamme < 0.8 || intensiteFlamme > 1.5){
            throw new AssertionError("L'intensité de la flamme doit être comprise entre 0.8 et 1.5");
        }
    }

    public CanardFeu(String nom, String prenom) {
        this(nom, prenom, 50, 13, 0.8);
    }



    @Override
    public String getType() {
        return "Feu";
    }
}
