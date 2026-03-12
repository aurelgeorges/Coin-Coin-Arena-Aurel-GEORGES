import canards.*;

void main() {
    CanardDeCombat donald = new CanardFeu("Donald", "Donald", 100, 20, 0.8);
    CanardDeCombat daisy = new CanardEau("Daisy", "Daisy", 80, 25, 15);


    donald.attaquer(daisy);
    daisy.attaquer(donald);

}
