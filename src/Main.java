//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossAttack(800);
        boss.setBossHealth(1500);
        boss.setBossDefence("magical");

    Hero[] heroes = createHeroes();

        System.out.println("\nHeroes info:");
        for (Hero hero : createHeroes()){
            System.out.println("attack: " + hero.getHeroAttack());
            System.out.println("health: " + hero.getHeroHealth());
            System.out.println("SuperAbility: " + hero.getHeroSuperAbility());
        }
    }


    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(800, 50,"physical");
        Hero hero2 = new Hero(500,1000,  "magical" );
        Hero hero3 = new Hero(700,500,  "cinetic");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }

}
