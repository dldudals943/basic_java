package horserace;

public class Trainer {
	int[] skill;
	int[] exp;

	Trainer(int a, int b, int c, int d, int e) {
		skill = new int[] { a, b, c, d, e };
		exp = new int[] { 0, 0, 0, 0, 0 };
	}

	Trainer() {
		skill = new int[] { 1, 1, 1, 1, 1 };
		exp = new int[] { 0, 0, 0, 0, 0 };
	}

	void training(int n, Horse horse) {
		horse.stat[n] = 20 * skill[n];
		horse.upDate();
		exp[n] += 20;
		levelUp();
	}

	void levelUp() {
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] >= 100) {
				skill[i]++;
			}
		}
	}

}
