/**
 *
 */
package part2.characters;

import part2.monsters.Matango;

/**
 * @author NishidaYouichi
 *
 */
public class Hero {

	private String name = "ミナト";
	private int hp = 100;
	public int mp = 10;

	public void attack(Matango matango) {
		System.out.println(this.name + "の攻撃！");
		matango.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
