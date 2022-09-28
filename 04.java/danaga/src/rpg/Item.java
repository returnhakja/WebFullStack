package rpg;

public class Item {
	String name;
	int hp;
	int mp;
	int satt;
	int def;
	public Item(String name, int hp, int mp, int satt, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.satt = satt;
		this.def = def;
	}
	@Override
	public String toString() {
		String info = name + ":";
		if(0 < hp) info += "체력+" + hp;
		if(0 < mp) info += "마나+" + mp;
		if(0<satt) info += "스탯공격력+ " +satt;
		if(0< def) info += "방어력+" + def;
		return info;
		
	}
	
}
