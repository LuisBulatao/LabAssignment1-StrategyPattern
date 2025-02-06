package Strategy.Defense;

public class Dodge implements DefenseStrategy {
    @Override
    public String defense() {
        return "Dodgin to avoid attack!";
    }
}