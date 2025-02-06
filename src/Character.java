import Strategy.Defense.DefenseStrategy;
import Strategy.Attack.AttackStrategy;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy[] defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy[] defenseStrategy){
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack(){
        System.out.println(attackStrategy.attack());
    }

    public void defense() {
        for (DefenseStrategy defenseStrategy : defenseStrategy) {
            System.out.println(defenseStrategy.defense());
        }
    }
}
