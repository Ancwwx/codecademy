package codecademyPractice;

public class test {
	public static void main(String[] args) {
		double[][] data = { { 1.4, 7.5, 3.5, 8.7, 9.2 }, { 0.8, 2.6, 6.3, 3.4, 7.5 } };

		for (int i = 0; i < data[1].length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.println(data[j][i]);
			}
		}

		int index = 1;
		for (int i = 0; i < 10; i++) {
			index = index++;
		}
		System.out.println(index);

	}

}
