package canards;


public class EspeceCanard {
    private final String nom; // ex. "Canard Flamme"
    private final TypeCanard type; // ex. TypeCanard.FEU
    private final int pvBase; // ex. 39
    private final int atkBase; // ex. 52
    private final String description; // ex. "Un canard dont la flamme ne s'éteint jamais"

    public EspeceCanard(String nom, TypeCanard type, int pvBase, int atkBase, String description) {
        this.nom = nom;
        this.type = type;
        this.pvBase = pvBase;
        this.atkBase = atkBase;
        this.description = description;
    }

    public final String getNom() {
        return nom;
    }

    public final TypeCanard getType() {
        return type;
    }

    public final int getPvBase() {
        return pvBase;
    }

    public final int getAtkBase() {
        return atkBase;
    }

    public final String getDescription() {
        return description;
    }

    public static final EspeceCanard CANARD_FLAMME = new EspeceCanard("Canard Flamme", TypeCanard.FEU, 39, 52, "Un canard dont la flamme ne s'éteint jamais.");
    public static final EspeceCanard CANARD_MARIN = new EspeceCanard("Canard Marin", TypeCanard.EAU, 44, 48,"Un canard qui maîtrise les courants.");
    public static final EspeceCanard CANARD_MOUSSE = new EspeceCanard("Canard Mousse", TypeCanard.PLANTE, 45, 49, "Un canard recouvert de mousse régénérante.");
    public static final EspeceCanard CANARD_CLASSIQUE = new EspeceCanard("Canard Classique", TypeCanard.NORMAL, 50, 45, "Le bon vieux canard jaune. Indémodable.");
    public static final EspeceCanard CANARD_VOLCAN = new EspeceCanard("Canard Volcan", TypeCanard.VOLCAN, 60, 60, "Un canard qui a été forgé dans les entrailles d'un volcan. Il est extrêmement puissant mais subit des dégâts de brûlure à chaque tour.");
}
