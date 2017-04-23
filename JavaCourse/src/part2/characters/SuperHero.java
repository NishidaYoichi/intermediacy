/**
 *
 */
package part2.characters;

/**
 * @author NishidaYouichi
 *
 */
public class SuperHero extends Hero {

	private boolean flying;


	public SuperHero() {
		super();
	}

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println("撤退した");
	}

}
