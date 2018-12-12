package Cal;
public class Ord {
	public void MaxMin (double[] arreglo) {
		double aux;
		int c = 1;
		while (c < arreglo.length) {
			for(int i = 0; i<arreglo.length-1; i++) {
				if (arreglo[i] < arreglo[i+1]) {
				    aux = arreglo[i];
				    arreglo[i] = arreglo[i+1];
				    arreglo[i+1] = aux;
			    }
			}
			c++;
			if (c == arreglo.length) {
				break;
			}
		}
	}
	public void MinMax (double[] arreglo) {
		double aux;
		int c = 1;
		while (c < arreglo.length) {
			for (int i=0; i<arreglo.length-1; i++) {
				if (arreglo[i]>arreglo[i+1]) {
					aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
			c++;
			if (c==arreglo.length) { 
				break;
			}
		}
	}
	public void MaxMinChar (String chara) {
		double aux;
		int c = 1;
		int i;
		chara = chara.toUpperCase();
		double [] string = new double [chara.length()];
		for (i = 0; i < string.length; i++) {
			string [i] = CharInt(chara.substring(i, i+1));
		}
		while (c < string.length) {
			for(i = 0; i<string.length-1; i++) {
				if (string[i] < string[i+1]) {
				    aux = string[i];
				    string[i] = string[i+1];
				    string[i+1] = aux;
			    }
			}
			c++;
			if (c == string.length) {
				break;
			}
		}
		chara = ("");
		for(i = 0; i <string.length; i++) {
			chara += IntChar((int)string[i]);
		}
		System.out.println(chara);
	}
	public void MinMaxChar (String chara) {
		double aux;
		int c = 1;
		int i;
		chara = chara.toUpperCase();
		double [] string = new double [chara.length()];
		for (i = 0; i < string.length; i++) {
			string [i] = CharInt(chara.substring(i, i+1));
		}
		while (c < string.length) {
			for (i = 0; i< string.length-1; i++) {
				if (string[i] > string[i+1]) {
					aux = string[i];
					string[i] = string[i+1];
					string[i+1] = aux;
				}
			}
			c++;
			if (c == string.length) { 
				break;
			}
		}
		chara = ("");
		for(i = 0; i <string.length; i++) {
			chara += IntChar((int)string[i]);
		}
		System.out.println(chara);
	}
	public void MaxMinIntChar (double[] string) {
		double aux;
		int c = 1;
		int i;
		String chara;
		while (c < string.length) {
			for(i = 0; i<string.length-1; i++) {
				if (string[i] < string[i+1]) {
				    aux = string[i];
				    string[i] = string[i+1];
				    string[i+1] = aux;
			    }
			}
			c++;
			if (c == string.length) {
				break;
			}
		}
		chara = ("");
		for(i = 0; i <string.length; i++) {
			chara += IntChar((int)string[i]);
		}
		System.out.println(chara);
	}
	public void MinMaxIntChar (double[] string) {
		double aux;
		int c = 1;
		int i;
		String chara;
		while (c < string.length) {
			for (i = 0; i< string.length-1; i++) {
				if (string[i] > string[i+1]) {
					aux = string[i];
					string[i] = string[i+1];
					string[i+1] = aux;
				}
			}
			c++;
			if (c == string.length) { 
				break;
			}
		}
		chara = ("");
		for(i = 0; i <string.length; i++) {
			chara += IntChar((int)string[i]);
		}
		System.out.println(chara);
	}
	private static int CharInt (String chara) {
		int resultado = 0;
		switch(chara) {
		case("A"): resultado = 1; break;
		case("B"): resultado = 2; break;
		case("C"): resultado = 3; break;
		case("D"): resultado = 4; break;
		case("E"): resultado = 5; break;
		case("F"): resultado = 6; break;
		case("G"): resultado = 7; break;
		case("H"): resultado = 8; break;
		case("I"): resultado = 9; break;
		case("J"): resultado = 10; break;
		case("K"): resultado = 11; break;
		case("L"): resultado = 12; break;
		case("M"): resultado = 13; break;
		case("N"): resultado = 14; break;
		case("Ñ"): resultado = 15; break;
		case("O"): resultado = 16; break;
		case("P"): resultado = 17; break;
		case("Q"): resultado = 18; break;
		case("R"): resultado = 19; break;
		case("S"): resultado = 20; break;
		case("T"): resultado = 21; break;
		case("U"): resultado = 22; break;
		case("V"): resultado = 23; break;
		case("W"): resultado = 24; break;
		case("X"): resultado = 25; break;
		case("Y"): resultado = 26; break;
		case("Z"): resultado = 27; break;
		default: resultado = 0; break;
		}
		return resultado;
	}
	private static String IntChar (int numb) {
		String resultado = new String("");
		switch(numb) {
		case(1): resultado = "A"; break;
		case(2): resultado = "B"; break;
		case(3): resultado = "C"; break;
		case(4): resultado = "D"; break;
		case(5): resultado = "E"; break;
		case(6): resultado = "F"; break;
		case(7): resultado = "G"; break;
		case(8): resultado = "H"; break;
		case(9): resultado = "I"; break;
		case(10): resultado = "J"; break;
		case(11): resultado = "K"; break;
		case(12): resultado = "L"; break;
		case(13): resultado = "M"; break;
		case(14): resultado = "N"; break;
		case(15): resultado = "Ñ"; break;
		case(16): resultado = "O"; break;
		case(17): resultado = "P"; break;
		case(18): resultado = "Q"; break;
		case(19): resultado = "R"; break;
		case(20): resultado = "S"; break;
		case(21): resultado = "T"; break;
		case(22): resultado = "U"; break;
		case(23): resultado = "V"; break;
		case(24): resultado = "W"; break;
		case(25): resultado = "X"; break;
		case(26): resultado = "Y"; break;
		case(27): resultado = "Z"; break;
		default: resultado = "*"; break;
		}
		return resultado;
	}
}