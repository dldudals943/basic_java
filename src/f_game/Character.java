package f_game;

public class Character {
	//RPG게임
	String name;
	int level;
	int maxHP;
	int hp;
	int maxMP;
	int mp;
	int atk;
	int def;
	int exp;
	Item[] items;
	
	Character(String name, int hp, int mp, int atk, int def){
		this.name = name;
		this.maxHP = hp;
		this.maxMP = mp;
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.atk = atk;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("=============================================");
		System.out.println("---------------------상태---------------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHP);
		System.out.println("마나 : " + mp + "/" + maxMP);
		System.out.println("공격 : " + atk);
		System.out.println("방어 : " + def);
		System.out.println("---------------------아이템-------------------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("=============================================");
	}
	
	void attack(Monster m){
		int damage = atk - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "(이)가 공격으로" + m.name + "에게" + damage +"만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHP += 10;
		maxMP += 5;
		atk += 2;
		def += 2;
		hp = maxHP;
		mp = maxMP;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item){
		System.out.println(item.name + "을 획득하셨습니다.");
		for(int i = 0 ; i < items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		maxHP += item.hp;
		maxMP += item.mp;
		atk += item.atk;
		def += item.def; 
	}
	
	
	
	
	
	
	
}
