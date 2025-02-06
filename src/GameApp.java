import Strategy.Attack.AttackStrategy;
import Strategy.Attack.CastSpell;
import Strategy.Attack.ShootArrow;
import Strategy.Attack.SwingSword;
import Strategy.Defense.DefenseStrategy;
import Strategy.Defense.Dodge;
import Strategy.Defense.MagicBarrier;
import Strategy.Defense.Shield;

public class GameApp {
    public static void main(String[] args) {
        AttackStrategy knightAttackStrategy = new SwingSword();
        AttackStrategy wizardAttackStrategy = new CastSpell();
        AttackStrategy archerAttackStrategy = new ShootArrow();

        DefenseStrategy[] knightDefenseStrategy = {new Shield(), new Dodge(), new MagicBarrier()};
        DefenseStrategy[] wizardDefenseStrategy = {new MagicBarrier()};
        DefenseStrategy[] archerDefenseStrategy = {new Dodge()};

        Character knight = new Character("Knight", knightAttackStrategy, knightDefenseStrategy);
        Character wizard = new Character("Wizard", wizardAttackStrategy, wizardDefenseStrategy);
        Character archer = new Character("Archer", archerAttackStrategy, archerDefenseStrategy);


        knight.attack();
        knight.defense();

        System.out.println();
        wizard.attack();
        wizard.defense();

        System.out.println();
        archer.attack();
        archer.defense();

    }

}