package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		CurrencyConverter.rate = rate; // 클래스 변수라 클래스 이름 써주고 this가 의미가 없음. static이라서..

	}

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		return won / rate;
	}

	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		return dollar * rate;
	}

	

}
