package status;

import canards.Canard;

public interface Combattant_B {
    void attaquer(Canard cible);
    boolean estKO();
    String getNom();
}
