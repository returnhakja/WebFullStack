package rpg;

public class monster {

	String name;
	int maxhp;
	int maxmp;
	int hp;
	int mp;
	int att;
	int def;
	Item[] items;
	public monster(String name, int hp, int mp, int att, int def, Item[] items) {
		super();
		this.name = name;
		this.hp = this.maxhp;
		this.mp = this.maxmp;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	
	void attack(Character c) {
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp - c.hp: c.hp - damage;
		System.out.println(name + "공격으로" + c.name + "에게" + damage + "만큼 피해" );
		System.out.println(c.name + "의 현재 HP :" + c.hp);
	}
	Item itemDrop() {
//		System.out.println(items.length);
		return items[(int)(Math.random() * items.length)];
		
	}
	
}
