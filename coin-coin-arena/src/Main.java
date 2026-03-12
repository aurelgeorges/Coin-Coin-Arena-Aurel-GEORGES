import canards.*;
import equipe.Equipe;

void main() {
    CanardDeCombat donald = new CanardFeu("Donald", "Donald", 100, 20, 0.8);
    CanardDeCombat daisy = new CanardEau("Daisy", "Daisy", 80, 25, 15);

    Equipe equipe1 = new Equipe("Dresseur 1");
    equipe1.ajouter(donald);
    equipe1.ajouter(daisy);
    equipe1.afficher();

    equipe1.retirer("Donald");
    equipe1.afficher();

}
