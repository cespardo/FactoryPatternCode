
public class CoinTest {

	public static void main(String[] args) {

		Coin pesoCol = CoinFactory.buildCoin("USA");
		System.out.println("Simbolo de la moneda es: " + pesoCol.getSymbol());
	}

}
