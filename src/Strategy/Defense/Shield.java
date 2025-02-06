package Strategy.Defense;

public class Shield implements DefenseStrategy {
    @Override
    public String defense() {
        return "Using a shield to defend!";
    }
}