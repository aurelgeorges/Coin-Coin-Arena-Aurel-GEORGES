import canards.Canard;
import canards.EspeceCanard;

public class Main {

    public static void main(String[] args) {
        Canard c1 = new Canard(EspeceCanard.CANARD_FLAMME, "Duck");
        Canard c2 = new Canard(EspeceCanard.CANARD_CLASSIQUE, "Daffy");

        c1.attaquer(c2);
    }
}