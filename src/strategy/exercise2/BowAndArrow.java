package strategy.exercise2;

public class BowAndArrow implements WeaponBehavior{
	@Override
	public void fight() {
		System.out.println("using my " + this.getClass().getSimpleName());
		
		
	}
}
