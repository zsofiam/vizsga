package vizsga;

import java.util.Scanner;

public class Vizsga2 {

	public static void main(String[] args) {
		System.out.println("2. feladat");
		System.out.println("Parancssorban kiírjuk az összes primitív"
				+ " változó minimum és maximum értékét, ha van ilyen.");
		System.out.println();
		System.out.println("Primitív változók minimum és maximum értékei");
		displayMinAndMaxValue(Byte.TYPE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displayMinAndMaxValue(Short.TYPE, Short.MIN_VALUE, Short.MAX_VALUE);
		displayMinAndMaxValue(Character.TYPE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		displayMinAndMaxValue(Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displayMinAndMaxValue(Long.TYPE, Long.MIN_VALUE, Long.MAX_VALUE);
		displayMinAndMaxValue(Float.TYPE, Float.MIN_VALUE, Float.MAX_VALUE);
		displayMinAndMaxValue(Double.TYPE, Double.MIN_VALUE, Double.MAX_VALUE);
		displayMinAndMaxValue(Boolean.TYPE, 0, 1);
		
		System.out.println();
		System.out.println("3. feladat");
		System.out.println("Boolean változó ismeretében"
				+ " byte változót állítgatunk (true => 1, false => 0) adatbekérés alapján.");
		System.out.println();
		setByteValue();
	}

	private static void setByteValue() {
		Scanner scanner = new Scanner(System.in);
		boolean trueOrFalse = false;
		byte byteVariable;
		while(true) {
		System.out.println("igaz (true), hamis (false) vagy lépjen ki?");
		String answer = scanner.nextLine();
		switch(answer.toLowerCase()) {
		case "igaz":
		case "true":
			trueOrFalse = true;
			break;
		case "hamis":
		case "false":
			trueOrFalse = false;
			break;
		default:
			System.out.println("Köszönjük a résztvételt!");
			scanner.close();
			System.exit(0);
		}
		byteVariable = (byte) (trueOrFalse == true ? 1 : 0);
		System.out.println("Byte változónk értéke most " + byteVariable + ".");
		}
	}

	public static void displayMinAndMaxValue(Class<?> type, Number min, Number max) {
		System.out.printf("típus: %-8s min: %-22s max: %s\n", type, min, max);
	}
}