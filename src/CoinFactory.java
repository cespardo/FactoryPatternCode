
public class CoinFactory {
	
	public static Coin buildCoin (String pais){
		
		if(pais.equalsIgnoreCase("USA")){
			return new Dollar();
		}
		if(pais.equalsIgnoreCase("COLOMBIA")){
			return new Peso();
		}
		if(pais.equalsIgnoreCase("PERU")){
			return new Sol();
		}
		throw new IllegalArgumentException("No existe la moneda para el país");
	}

}
