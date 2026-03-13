package arene;

import canards.CanardPlante;
import equipe.Equipe;
import canards.CanardDeCombat;

public class Arene {

    public static void combattre(Equipe equipe1, Equipe equipe2) {
        Equipe equipeGagnant = null;
        int nbtours = 0;
        CanardDeCombat canardE1 = equipe1.getPremierValide();
        CanardDeCombat canardE2 = equipe2.getPremierValide();

        System.out.println("");

        while (true) {
            nbtours++;

            System.out.println("\nTour " + nbtours + " :");

            canardE1.attaquer(canardE2);

            if (canardE2.estKO()) {
                System.out.println("\n" + canardE2.getSurnom() + " de " + equipe2.getNomDresseur() + " est KO !");

                canardE2 = equipe2.getPremierValide();
                if(canardE2 == null){
                    equipeGagnant = equipe1;
                    break;
                }
                System.out.println(canardE2.getSurnom() + " de " + equipe2.getNomDresseur() + " est envoyé au combat !");
            }

            if (canardE1.estKO()) {
                System.out.println("\n" + canardE1.getSurnom() + " de " + equipe1.getNomDresseur() + " est KO !");
                canardE1 = equipe1.getPremierValide();

                if(canardE1 == null) {
                    equipeGagnant = equipe2;
                    break;
                }
                System.out.println(canardE1.getSurnom() + " de " + equipe1.getNomDresseur() + " est envoyé au combat !");
            }

            System.out.println();
            canardE2.attaquer(canardE1);

            if (canardE2.estKO()) {
                System.out.println("\n" + canardE2.getSurnom() + " de " + equipe2.getNomDresseur() + " est KO !");

                canardE2 = equipe2.getPremierValide();
                if(canardE2 == null){
                    equipeGagnant = equipe1;
                    break;
                }
                System.out.println(canardE2.getSurnom() + " de " + equipe2.getNomDresseur() + " est envoyé au combat !");
            }

            if (canardE1.estKO()) {
                System.out.println("\n" + canardE1.getSurnom() + " de " + equipe1.getNomDresseur() + " est KO !");
                canardE1 = equipe1.getPremierValide();

                if(canardE1 == null) {
                    equipeGagnant = equipe2;
                    break;
                }
                System.out.println(canardE1.getSurnom() + " de " + equipe1.getNomDresseur() + " est envoyé au combat !");
            }

            if(canardE1 instanceof CanardPlante){
                ((CanardPlante) canardE1).regenerer();
            }

            if(canardE2 instanceof CanardPlante) {
                ((CanardPlante) canardE2).regenerer();
            }
        }

        System.out.println(
            "\nL'équipe gagnante est : " + equipeGagnant.getNomDresseur() + " en " + nbtours + " tours !\n"
        );
        equipeGagnant.afficher();
    }
}
