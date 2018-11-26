package cal;
import java.util.Scanner;

public class Cal_Class {
	public static void cal_Aritm (){
		Scanner sc = new Scanner(System.in);
		double A = 0;
		double B = 0;
		String option = new String ();
		boolean Aux = true;
		System.out.print("Calculadora aritm�tica. . . "+"\n");
		while (Aux == true) {
			System.out.print("Ingrese la operaci�n."+"\n"+"	+) Adici�n."+"\n"
					+ "	-) Sustracci�n."+"\n"+	"	*) Multiplicaci�n."+"\n"
					+"	/) Divisi�n."+"\n"+ "	%) Resto de divisi�n."+"\n"
					+"	^) Potencias."+"\n"
					+"Ingrese [0] y pulse [ENTER] para"
					+ " retroceder."+"\n");
			option = sc.next();
			switch(option){
				case "+":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextInt();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextInt();
					System.out.println(A+" + "+B+" = "+(A+B)+"\n");
					break;
				case "-":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextDouble();
					System.out.println(A+" - "+B+" = "+(A-B)+"\n");
					break;
				case "*":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextDouble();
					System.out.println(A+" * "+B+" = "+(Opera.multiply(A, B))+"\n");
					break;
				case "/":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextDouble();
					System.out.println(A+" / "+B+" = "+(Opera.division(A, B))+"\n");
					break;
				case "%":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextDouble();
					System.out.println(A+" % "+B+" = "+(Opera.divMod(A, B))+"\n");
					break;
				case "^":
					System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operaci�n.");
					B = sc.nextDouble();
					System.out.println(A+" ^ "+B+" = "+(Opera.power(A, B))+"\n");
					break;
				case "0": System.out.println(". . . Atras . . ."+"\n"); Aux = false;break;
				default: System.out.println("Dato inv�lido, int�ntelo otra vez."+"\n");break;
			}
		}
	}
	public static void cal_Bin () {
		Scanner sc = new Scanner(System.in);
		int A1 = 0;
		int B1 = 0;
		String A2 = new String ("");
		String B2 = new String ("");
		String option = new String ();
		boolean Aux = true;
		System.out.print("Calculadora de programador. . . "+"\n");
		while (Aux == true) {
			System.out.print("Ingrese la operaci�n."+"\n"+"	BIN) Suma de binarios."+"\n"
					+ "	HEX) Suma de hexadecimales."+"\n"+	"	CBS) Cambiar de base."+"\n"+
					"	DAB) Decimal a otras bases."+"\n"
					+"Ingrese [0] y pulse [ENTER] para"
					+ " retroceder."+"\n");
			option = sc.next();
			switch(option.toUpperCase()){
				case "BIN": System.out.print("�Desea sumar n�meros decimales o binarios?"
											+"\n"+"	DEC) Decimales."
											+"\n"+"	BIN) Binarios."
											+"\n");
					option = sc.next();
					switch(option.toUpperCase()) {
						case "DEC":
							System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
							A1 = sc.nextInt();
							System.out.println("Ingrese otro valor para continuar la operaci�n.");
							B1 = sc.nextInt();
							System.out.print("En Binario es: "+Bin.CambioBase(A1, 2)+" + "
							+Bin.CambioBase(B1, 2)+" = "+Bin.Suma_BinDec(A1, B1)
							+"\n"+"En Decimal es: "+A1+" + "+B1+" = "
							+(A1+B1)+"\n\n");
							break;
						case "BIN":
							System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
							A2 = sc.next();
							System.out.println("Ingrese otro valor para continuar la operaci�n.");
							B2 = sc.next();
							System.out.print("En Binario es: "+A2+" + "+B2+" = "
							+Bin.CambioBase((Bin.BinADecimal(A2)+Bin.BinADecimal(B2)),2)
							+"\n"+"En Decimal es: "+Bin.BinADecimal(A2)+" + "+Bin.BinADecimal(B2)
							+" = "+((Bin.BinADecimal(A2)+Bin.BinADecimal(B2)))
							+"\n\n");
							break;
						default:
							System.out.println("Dato inv�lido,intentelo otra vez."+"\n");
							break;
					}
					break;
				case "HEX":
					System.out.print("�Desea sumar n�meros decimales o binarios?"
							+"\n"+"	DEC) Decimales."
							+"\n"+"	HEX) Binarios."
							+"\n");
					option = sc.next();
					switch(option.toUpperCase()) {
					case "DEC":
						System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
						A1 = sc.nextInt();
						System.out.println("Ingrese otro valor para continuar la operaci�n.");
						B1 = sc.nextInt();
						System.out.print("En Hexadecimal es: "+Bin.CambioBase(A1, 16)+" + "
						+Bin.CambioBase(B1, 16)+" = "+Bin.Suma_HexDec(A1, B1)
						+"\n"+"En Decimal es: "+A1+" + "+B1+" = "
						+(A1+B1)+"\n\n");
						break;
					case "HEX":
						System.out.print("Ingrese un valor para someterlo a operaci�n."+"\n");
						A2 = sc.next();
						System.out.println("Ingrese otro valor para continuar la operaci�n.");
						B2 = sc.next();
						System.out.print("En Hexadecimal es: "+A2+" + "+B2+" = "
						+Bin.CambioBase((Bin.HexADecimal(A2)+Bin.HexADecimal(B2)),16)
						+"\n"+"En Decimal es: "+Bin.HexADecimal(A2)+" + "+Bin.HexADecimal(B2)+" = "
						+((Bin.HexADecimal(A2)+Bin.HexADecimal(B2)))
						+"\n\n");
						break;
					default:
						System.out.println("Dato inv�lido,intentelo otra vez."+"\n");
						break;
						}
					break;
				case "CBS":
					System.out.print("Ingrese el valor el cual desea transformar."+"\n");
					A2 = sc.next();
					System.out.print("Ingrese la base del valor (el rango permitido es de 2 a 16)."+"\n");
					A1 = sc.nextInt();
					System.out.println("Ingrese la base a la cual se quiere cambiar (el rango permitido es de 2 a 16).");
					B1 = sc.nextInt();
					System.out.println("("+A2.toUpperCase()	+")"+A1+" a ()"+B1+" es ("+(Bin.CambioBase(Bin.BaseADecimal(A2, A1), B1))+")"+B1+"\n");
					break;
				case "DAB":
					break;
				case "0": System.out.println(". . . Atras . . ."+"\n"); Aux = false;break;
				default: System.out.println("Dato inv�lido, int�ntelo otra vez."+"\n");break;
			}
		}
	}
	public static void cal_Prom () {
		Scanner sc = new Scanner(System.in);
	}
	public static void cal_Dat () {
		Scanner sc = new Scanner(System.in);
	}
}