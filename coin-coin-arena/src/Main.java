import arene.Arene;
import canards.*;
import equipe.Equipe;

public class Main {

    public static void main(String[] args) {

        //1. Créez des canards à partir des espèces prédéfinies.
        Canard c1 = new Canard(EspeceCanard.CANARD_MARIN, "Kainard");
        Canard c2 = new Canard(EspeceCanard.CANARD_CLASSIQUE, "Ratanard");

        //2. Montrez qu’on peut créer plusieurs canards de la même espèce (deux “Canard Flamme” différents avec des surnoms différents).
        Canard c3 = new Canard(EspeceCanard.CANARD_FLAMME, "Flambo");
        Canard c4 = new Canard(EspeceCanard.CANARD_FLAMME, "Braise");

        //3. Faites combattre deux équipes.
        Equipe equipeRed = new Equipe("Red");
        Equipe equipeBlue = new Equipe("Blue");

        equipeRed.ajouter(new Canard(EspeceCanard.CANARD_FLAMME, "Canacendre"));
        equipeRed.ajouter(new Canard(EspeceCanard.CANARD_MOUSSE, "Tortinard"));
        equipeRed.ajouter(new Canard(EspeceCanard.CANARD_FLAMME, "Oustinard"));

        equipeBlue.ajouter(new Canard(EspeceCanard.CANARD_MOUSSE, "Verdunard"));
        equipeBlue.ajouter(new Canard(EspeceCanard.CANARD_MARIN, "Hydranard"));
        equipeBlue.ajouter(new Canard(EspeceCanard.CANARD_MARIN, "Marinard"));

        equipeBlue.afficher();
        equipeRed.afficher();

        System.out.println("\n=== COMBAT ===");
        Arene.combattre(equipeRed, equipeBlue);

        //4. Ajoutez une nouvelle espèce et un nouveau type en quelques lignes, sans créer de classe
        Canard c5 = new Canard(EspeceCanard.CANARD_VOLCAN, "Volcanard");
        System.out.println("\nCréation d'un nouveau canard de type Volcan :");
        System.out.println(c5);


    }

    static void mainA() {
        /*Ne fonctionne plus suite à l'adaptation de Arene & equipe à utiliser la classe Canard.

        Equipe equipe1 = new Equipe("Donald");
        Equipe equipe2 = new Equipe("Daisy");

        equipe1.ajouter(new CanardFeu("Flambo", "Fifi", 70, 16, 1.1));
        equipe1.ajouter(new CanardConfus("Trouble", "Lulu", 60, 14, 12));
        equipe1.ajouter(new CanardPlante("Verdure", "Riri", 75, 13));

        equipe2.ajouter(new CanardEau("Splash", "Dewey", 68, 15, 11));
        equipe2.ajouter(new CanardClassique("Basic", "Huey", 72, 14));
        equipe2.ajouter(new CanardFeu("Braise", "Louie", 65, 17, 1.0));

        equipe1.afficher();

        equipe2.afficher();

        System.out.println("\n=== COMBAT ===");
        Arene.combattre(equipe1, equipe2);

        System.out.println("Nombre total de canards créés : " + CanardDeCombat.getNbCanardsCrees());*/
    }

}