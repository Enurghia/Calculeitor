package Cal;
public class Prom {
	public static double Promedio (double [] Promedio) {
		double acumular = 0;
		for (int i = 0; i < Promedio.length; i++) {
			acumular += Promedio[i];
		}
		double resultado = (Opera.division(acumular, Promedio.length));
		return resultado;
	}
	public static double Delta (String valor) {
		String arreglar = new String ("");
		for(int i = 0; i < valor.length(); i++) {
			switch (valor.substring(i, i+1)){
			case "0": arreglar += "0"; break;
			case "1": arreglar += "1"; break;
			case "2": arreglar += "2"; break;
			case "3": arreglar += "3"; break;
			case "4": arreglar += "4"; break;
			case "5": arreglar += "5"; break;
			case "6": arreglar += "6"; break;
			case "7": arreglar += "7"; break;
			case "8": arreglar += "8"; break;
			case "9": arreglar += "9"; break;
			case ",": arreglar += "."; break;
			case ".": arreglar += "."; break;
			default: break;
			}
		}
		if(arreglar.isEmpty()) {
			double resultado = 0;
			return resultado;
		}
		else {
			double resultado = Double.valueOf(("0"+arreglar));
			return resultado;
		}
	}
}