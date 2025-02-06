package Strategy.Attack;

public class ShootArrow implements AttackStrategy {
    @Override
    public String attack() {
        return "Archer shoots an arrow!";
    }
}
