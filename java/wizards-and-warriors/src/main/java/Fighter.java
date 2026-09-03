class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    private final int WARRIOR_NORMAL_DAMAGE = 6;
    private final int WARRIOR_VULNERABLE_DAMAGE = 10;
    
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? WARRIOR_VULNERABLE_DAMAGE : WARRIOR_NORMAL_DAMAGE;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean isSpellPrepared;

    private final int WIZARD_NORMAL_DAMAGE = 3;
    private final int WIZARD_PREPARED_SPELL_DAMAGE = 12;

    public void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return isSpellPrepared ? WIZARD_PREPARED_SPELL_DAMAGE : WIZARD_NORMAL_DAMAGE;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
