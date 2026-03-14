package canards;

public enum TypeCanard {
    FEU("Feu"),
    EAU("Eau"),
    PLANTE("Plante") {
        @Override
        public void finDeTour(Canard c) {
            if (c.getPvActuels() == c.getPvMax()) {
                return;
            }
            int soin = (int) (c.getPvMax() * 0.10);
            c.setPvActuels(c.getPvActuels() + soin);
            System.out.println(c.getSurnom() + " se régénère de " + soin + " PV !");
        }
    },
    NORMAL("Normal"),
    VOLCAN("Volcan") {
        @Override
        public void finDeTour(Canard c) { //Subit 10% de ses PV max de dégât chaque tour
            int degats = (int) (c.getPvMax() * 0.10);
            c.setPvActuels(c.getPvActuels() - degats);
            System.out.println(c.getSurnom() + " subit " + degats + " dégâts de brûlure !");
        }
    };

    // Table de multiplicateurs [attaquant][cible]
    private static final double[][] TABLETYPE = {
        { 1.0, 0.5, 2.0, 1.0, 0.5 },  // FEU
        { 2.0, 1.0, 0.5, 1.0, 0.5 },  // EAU
        { 0.5, 2.0, 1.0, 1.0, 0.5 },  // PLANTE
        { 1.0, 1.0, 1.0, 1.0, 0.5 },  // NORMAL
        { 1.5, 1.5, 1.5, 1.0, 0.5 }   // VOLCAN
    };

    private final String libelle;

    TypeCanard(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void finDeTour(Canard c) {
        return;
    }

    public double getMultiplicateur(TypeCanard cible) {
        return TABLETYPE[this.ordinal()][cible.ordinal()];
    }
}
