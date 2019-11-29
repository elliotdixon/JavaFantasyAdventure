package Players;



public enum Attributes {

    //Weapons

    SWORD(-6),
    AXE(-7),
    CLUB(-4),
    WAND(-1),
    THEAXEOFJAVASCRIPTEVANGELISM(-7),
    HUNGARIANBOW(-420),
    CLAYMORE(-10),
    BOOK(-1),

    //HEALING

    ZSOLTHAND(5),
    FREEDRINKS(5),
    QUIZHOMEWORK(100),
    FIVEMINUTEBREAK(5),
    TENMINUTEBREAK(10),
    LUNCH(60),

    //SPELLS
    ALLDAYLAB(100),
    JAVA(5),
    POLYMORPHIC(4),
    ENUMPELT(3),
    RUBY(2),
    CRUDATTACK(1),


    // Armor

    ANGULARHELMET(2),
    REACTIVECHESTPLATE(3),
    SHEILD(1),
    CLOAK(2),

    //Enemy attacks

    ANYQUESTIONS(2);

    private final int baseAffectOnHP;

    Attributes(int baseAffectOnHP) {
        this.baseAffectOnHP = baseAffectOnHP;
    }

    public int getBaseAffect() {
        return baseAffectOnHP;
    }

}

