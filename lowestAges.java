package LearningJava;

public class lowestAges {

	public static void main(String[] args) {
		int ages[] = { 10, 12, 13, 14, 15, 16, 17, 18, 19 };

		int lowest = ages[0];

		for (int age : ages) {
			if (lowest > age) {
				lowest = age;
			}
		}
		System.out.println("Lowest ages among all the given ages:"+lowest);
	}
	

}
