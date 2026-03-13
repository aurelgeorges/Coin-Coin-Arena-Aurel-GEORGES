public enum TypeCanard {
    FEU("Feu"),
    EAU("Eau"),
    PLANTE("Plante"),
    NORMAL("Normal");

    // Table de multiplicateurs [attaquant][cible]
    private static final double[][] TABLETYPE = {
        { 1.0, 0.5, 2.0, 1.0 },  // FEU
        { 2.0, 1.0, 0.5, 1.0 },  // EAU
        { 0.5, 2.0, 1.0, 1.0 },  // PLANTE
        { 1.0, 1.0, 1.0, 1.0 }   // NORMAL
    };

    private final String libelle;

    TypeCanard(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getMultiplicateur(TypeCanard cible) {
        return TABLETYPE[this.ordinal()][cible.ordinal()];
    }
}
