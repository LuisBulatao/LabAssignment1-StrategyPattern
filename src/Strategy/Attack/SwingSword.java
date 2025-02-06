package Strategy.Attack;

public class SwingSword implements AttackStrategy {
    @Override
    public String attack() {
        return "Knight attacks with a sword!";
    }
}
