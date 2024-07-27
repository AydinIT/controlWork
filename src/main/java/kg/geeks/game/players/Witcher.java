package kg.geeks.game.players;

public class Witcher extends Hero {

    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.MAKE_ALIVE);
        this.setDamage(0);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (this.getHealth() > 0) {
                if (hero.getHealth() <= 0 && hero != this) {
                    hero.setHealth(this.getHealth());
                    this.setHealth(0);
                    System.out.println(this.getName() + " gives his life to " + hero.getName());
                }
            }
        }
    }
}
