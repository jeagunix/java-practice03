package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Goods[] beverage = new Goods[COUNT_GOODS];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < COUNT_GOODS; i++) {
			beverage[i] = new Goods();
			String info = scanner.nextLine();
			String[] data = info.split(" ");

			beverage[i].setName(data[0]);
			beverage[i].setPrice(Integer.parseInt(data[1]));
			beverage[i].setCountStock(Integer.parseInt(data[2]));
			
		}
		for (int i = 0; i < COUNT_GOODS; i++) {

			beverage[i].showEveryBeveragyinfo();
		}

		for (int i = 0; i < COUNT_GOODS; i++) {

			beverage[i].showEveryBeveragyinfo();
		}

		scanner.close();
	}
}
