package Strategy.Attack;

public class CastSpell implements AttackStrategy {
    @Override
    public String attack() {
        return "Wizard casts a spell!";
    }
}
