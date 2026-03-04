package canards;

public abstract class CanardDeCombat {
    private String nom;
    private String surnom;
    private final int pvMax;
    private int pvActuel;
    private int atck;

    private static int nbCanardsCrees;
    private static int ATK_MIN;

    public String getNom() {
        return nom;
    }

    public String getSurnom() {
        return surnom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getAtck() {
        return atck;
    }

    public static int getNbCanardsCrees() {
        return nbCanardsCrees;
    }

    public static int getAtkMin() {
        return ATK_MIN;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public CanardDeCombat(String nom, String prenom, int pvMax, int atck) {
        if(pvMax <= 0){
            throw new AssertionError("PV MAX du canard ne peuvent pas être négatif ou égal à 0");
        }

        if(atck < ATK_MIN){
            throw new AssertionError("L'attaque du canard ne peuvent pas être inférieur à " + ATK_MIN);
        }

        this.nom = nom;
        this.surnom = prenom;
        this.pvMax = pvMax;
        this.pvActuel = pvMax;
        this.atck = atck;
    }

    public abstract String getType();

    public boolean estKO(){ return pvActuel <= 0; }

    public void subirDegats(int degats) {
        if(degats < 0) {
            throw new AssertionError("Les dégats ne peuvent pas être négatif");
        }

        pvActuel -= degats;
        if(pvActuel < 0){
            pvActuel = 0;
        }

        System.out.printf("%s subit %s dégâts ! (PV: %s/%s)", surnom, degats, pvActuel, pvMax);
    }

    public void soigner(){
        pvActuel = pvMax;
    }

    public void attaquer(CanardDeCombat cible){

    }

    @Override
    public String toString() {
        return String.format("[%s] %s «%s» (PV: %s/%s |" + "ATK: %s)", getType(), nom, surnom, pvActuel, pvMax, atck);
    }
}
