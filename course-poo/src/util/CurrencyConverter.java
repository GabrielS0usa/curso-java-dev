package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double conversor(double valorDolar, double dolar) {
		return dolar * valorDolar * (1.0 + IOF);
	}

}
