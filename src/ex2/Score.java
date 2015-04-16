package ex2;

public class Score implements Comparable<Score> {
	private String name;
	private int math;
	private int english;

	public Score(String name, int math, int english) {
		this.name = name;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public int getMath() {
		return math;
	}

	public int getEnglish() {
		return english;
	}

	public int compareTo(Score another) {
		int anotherMath = another.getMath();
		int anotherEnglish = another.getEnglish();
		if (getMath() < anotherMath) {
			return 1;
		} else if (getMath() > anotherMath) {
			return -1;
		} else {
			if (getEnglish() < anotherEnglish) {
				return 1;
			} else if (getEnglish() > anotherEnglish) {
				return -1;
			}
			return 0;
		}
	}
}
