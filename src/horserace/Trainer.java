package horserace;

import java.util.Arrays;

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
		horse.stat[n-1] += 5 * skill[n-1];
		System.out.println("스탯이 올라갔습니다!");
		System.out.println(Arrays.toString(horse.stat));
		horse.upDate();
		System.out.println(horse.stat[n-1]);
		//exp[n-1] += 20;
		//levelUp();
	}

	void levelUp() {
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] >= 100) {
				skill[i]++;
			}
		}
	}

}
