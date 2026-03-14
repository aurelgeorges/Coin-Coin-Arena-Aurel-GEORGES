import arene.Arene;
import canards.*;
import equipe.Equipe;

public class Main {

    public static void main(String[] args) {
        Canard c1 = new Canard(EspeceCanard.CANARD_FLAMME, "Duck");
        Canard c2 = new Canard(EspeceCanard.CANARD_CLASSIQUE, "Daffy");

        c1.attaquer(c2);
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