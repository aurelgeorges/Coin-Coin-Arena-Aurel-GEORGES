package equipe;

import canards.CanardDeCombat;


public class Equipe {
    private CanardDeCombat[] canards = new CanardDeCombat[6];
    private final String nomDresseur;

    private static int nbEquipesCrees;

    public Equipe(String nomDresseur) {
        this.nomDresseur = nomDresseur;
        nbEquipesCrees++;
    }

    public boolean ajouter(CanardDeCombat c) {
        for (int i = 0; i < canards.length; i++) {
            if (canards[i] == null) {
                canards[i] = c;
                return true;
            }
        }

        return false;
    }

    public void retirer(String surnom) {
        for (int i = 0; i < canards.length; i++) {
            if (canards[i] != null && canards[i].getSurnom().equals(surnom)) {
                canards[i] = null;

                for (int j = i; j < canards.length - 1; j++) {
                    canards[j] = canards[j + 1];
                }
                canards[canards.length - 1] = null;
            }
        }
    }

    public CanardDeCombat getPremierValide() {
        for (CanardDeCombat c : canards) {
            if (c != null && !c.estKO()) {
                return c;
            }
        }
        return null;
    }

    public void soignerTous(){
        for (CanardDeCombat c : canards) {
            if (c != null) {
                c.soigner();
            }
        }
    }

    public void afficher() {
        System.out.println("Équipe de " + nomDresseur + " :");
        for (int i = 0; i < canards.length; i++) {
            if (canards[i] != null) {
                System.out.println((i + 1) + ". " + canards[i]);
            } else {
                System.out.println((i + 1) + ". [Vide]");
            }
        }
    }

    public boolean touteKO(){
        for (CanardDeCombat c : canards) {
            if (c != null && !c.estKO()) {
                return false;
            }
        }
        return true;
    }
}
