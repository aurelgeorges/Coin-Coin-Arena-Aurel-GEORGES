package canards;

import status.Combattant_B;
import status.Soignable;

public class Canard implements Combattant_B, Soignable {
    private final EspeceCanard espece; // le template
    private final String surnom;
    private final int pvMax;
    private int pvActuels;
    private final int atk;

    public Canard(EspeceCanard espece, String surnom) {
        this.espece = espece;
        this.surnom = surnom;
        this.pvMax = espece.getPvBase();
        this.pvActuels = pvMax;
        this.atk = espece.getAtkBase();
    }

    public TypeCanard getType () {
        return espece.getType();
    }

    @Override
    public void attaquer(Canard cible) {
        double mult = this.getType().getMultiplicateur(cible.getType());
        int degats = (int) (atk * mult);
        System.out.println(surnom + " attaque " + cible.surnom
                + " ! (" + getType().getLibelle()
                + " → " + cible.getType().getLibelle()
                + " : x" + mult + ") → " + degats + " dégâts");
        cible.subirDegats(degats);
    }

    public void subirDegats(int degats) {
        if (degats < 0) {
            throw new AssertionError("Les dégats ne peuvent pas être négatif");
        }

        pvActuels -= degats;
        if (pvActuels < 0) {
            pvActuels = 0;
        }

        System.out.printf(
                "%s subit %s dégâts ! (PV: %s/%s)%n",
                surnom,
                degats,
                pvActuels,
                pvMax
        );
    }

    @Override
    public boolean estKO() {
        return pvActuels <= 0;
    }

    @Override
    public String getNom() {
        return espece.getNom();
    }

    @Override
    public void soigner() {
        pvActuels = pvMax;
    }

    @Override
    public int getPvActuels() {
        return pvActuels;
    }

    @Override
    public int getPvMax() {
        return pvMax;
    }
}
