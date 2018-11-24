package Cal;
public class Bin {
	public static String CambioBase(int Decimal, int Base){
	if((Base > 16) || (Base < 2)){
		return "NaN";
	}
	else{
		int Aux;
		String Cambio = new String("");
		while(Decimal != 0){
			Aux = Decimal%Base;
			switch(Aux){
			case 10:
				Cambio = "A"+Cambio;break;
			case 11:
				Cambio = "B"+Cambio;break;
			case 12:
				Cambio = "C"+Cambio;break;
			case 13:
				Cambio = "D"+Cambio;break;
			case 14:
				Cambio = "E"+Cambio;break;
			case 15:
				Cambio = "F"+Cambio;break;
			default:
				Cambio = Aux+Cambio;break;
			}
			Decimal /= Base;
			}
			return Cambio;
		}
	}
	public static int BaseDecimal (String nBase){
		int resultado = 0;
		String stringResultado = new String (nBase);
		return resultado;
	}
}