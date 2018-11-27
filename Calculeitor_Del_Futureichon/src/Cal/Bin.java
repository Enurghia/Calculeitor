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
			Aux = (int)Opera.divMod(Decimal, Base);
			switch(Aux){
			case 0: Cambio = Aux+Cambio;break;
			case 1: Cambio = Aux+Cambio;break;
			case 2: Cambio = Aux+Cambio;break;
			case 3: Cambio = Aux+Cambio;break;
			case 4: Cambio = Aux+Cambio;break;
			case 5: Cambio = Aux+Cambio;break;
			case 6: Cambio = Aux+Cambio;break;
			case 7: Cambio = Aux+Cambio;break;
			case 8: Cambio = Aux+Cambio;break;
			case 9: Cambio = Aux+Cambio;break;
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
				Cambio = "0";Decimal = 0;break;
			}
			Decimal = (int)Opera.division(Decimal, Base);
			}
			return Cambio;
		}
	}
	public static int BaseADecimal (String Num_Base, int Base_Original){
		Num_Base = Num_Base.toUpperCase();
		int resultado = 0;
		String aux = new String (""); 
		String [] inverso = new String [Num_Base.length()];
		for(int i = 0; i < (Num_Base.length()); i++) {
			inverso[i] = Num_Base.substring(i, i+1);
			aux = inverso[i] + aux;
		}
		for(int i= 0; i < (Num_Base.length()); i++) {
			switch (aux.substring(i, i+1)){
			case "0": resultado += Opera.multiply(0,Opera.power(Base_Original, i)); break;
			case "1": resultado += Opera.multiply(1,Opera.power(Base_Original, i)); break;
			case "2": resultado += Opera.multiply(2,Opera.power(Base_Original, i)); break;
			case "3": resultado += Opera.multiply(3,Opera.power(Base_Original, i)); break;
			case "4": resultado += Opera.multiply(4,Opera.power(Base_Original, i)); break;
			case "5": resultado += Opera.multiply(5,Opera.power(Base_Original, i)); break;
			case "6": resultado += Opera.multiply(6,Opera.power(Base_Original, i)); break;
			case "7": resultado += Opera.multiply(7,Opera.power(Base_Original, i)); break;
			case "8": resultado += Opera.multiply(8,Opera.power(Base_Original, i)); break;
			case "9": resultado += Opera.multiply(9,Opera.power(Base_Original, i)); break;
			case "A": resultado += Opera.multiply(10,Opera.power(Base_Original, i)); break;
			case "B": resultado += Opera.multiply(11,Opera.power(Base_Original, i)); break;
			case "C": resultado += Opera.multiply(12,Opera.power(Base_Original, i)); break;
			case "D": resultado += Opera.multiply(13,Opera.power(Base_Original, i)); break;
			case "E": resultado += Opera.multiply(14,Opera.power(Base_Original, i)); break;
			case "F": resultado += Opera.multiply(15,Opera.power(Base_Original, i)); break;
			default: resultado = 0; i = Num_Base.length(); break;
			}
		}
		return resultado;
	}
	public static String Suma_BinDec (int Dec1, int Dec2) {
		String resultado = new String (CambioBase((Dec1 + Dec2),2));
		return resultado;
	}
	public static String Suma_BinDec (String Bin1, String Bin2) {
		Bin1 = Bin1.toUpperCase();
		Bin2 = Bin2.toUpperCase();
		String resultado = new String (CambioBase((BinADecimal(Bin1) + BinADecimal(Bin2)), 2));
		return resultado;
	}
	public static String Suma_HexDec (int Dec1, int Dec2) {
		String resultado = new String (CambioBase((Dec1 + Dec2),16));
		return resultado;
	}
	public static String Suma_HexDec (String Hex1, String Hex2) {
		Hex1 = Hex1.toUpperCase();
		Hex2 = Hex2.toUpperCase();
		String resultado = new String (CambioBase((HexADecimal(Hex1) + HexADecimal(Hex2)), 16));
		return resultado;
	}
	public static int BinADecimal (String binario) {
		int resultado = 0;
		for(int i= 0; i < (binario.length()); i++) {
			switch (binario.substring(i, i+1)){
			case "0": resultado += BaseADecimal(binario, 2); break;
			case "1": resultado += BaseADecimal(binario, 2); break;
			default: resultado = 0; i = binario.length(); break;
			}
		}
		resultado = (int)Opera.division(resultado, binario.length());
		return resultado;
	}
	public static int HexADecimal (String hexadecimal) {
		hexadecimal = hexadecimal.toUpperCase();
		int resultado = 0;
		for(int i= 0; i < (hexadecimal.length()); i++) {
			switch (hexadecimal.substring(i, i+1)){
			case "0": resultado += BaseADecimal(hexadecimal, 16); break;
			case "1": resultado += BaseADecimal(hexadecimal, 16); break;
			case "2": resultado += BaseADecimal(hexadecimal, 16); break;
			case "3": resultado += BaseADecimal(hexadecimal, 16); break;
			case "4": resultado += BaseADecimal(hexadecimal, 16); break;
			case "5": resultado += BaseADecimal(hexadecimal, 16); break;
			case "6": resultado += BaseADecimal(hexadecimal, 16); break;
			case "7": resultado += BaseADecimal(hexadecimal, 16); break;
			case "8": resultado += BaseADecimal(hexadecimal, 16); break;
			case "9": resultado += BaseADecimal(hexadecimal, 16); break;
			case "A": resultado += BaseADecimal(hexadecimal, 16); break;
			case "B": resultado += BaseADecimal(hexadecimal, 16); break;
			case "C": resultado += BaseADecimal(hexadecimal, 16); break;
			case "D": resultado += BaseADecimal(hexadecimal, 16); break;
			case "E": resultado += BaseADecimal(hexadecimal, 16); break;
			case "F": resultado += BaseADecimal(hexadecimal, 16); break;
			default: resultado = 0; i = hexadecimal.length(); break;
			}
		}
		resultado = (int)Opera.division(resultado, hexadecimal.length());
		return resultado;
	}
	public static String DecimalABin (int decimal){
		String resultado = new String (CambioBase(decimal,2));
		return resultado;
	}
	public static String DecimalAHex (int decimal){
		String resultado = new String (CambioBase(decimal,16));
		return resultado;
	}
}