package objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculos {
	public void operacion() {
		String pregunta;
		int a, b;
		Scanner teclat = new Scanner(System.in);
		try {
			System.out.println("Que operacion quieres hacer?");
			pregunta = teclat.next().toLowerCase();
			System.out.println("Introduce el valor de a: ");
			a = teclat.nextInt();
			System.out.println("Introduce el valor de b: ");
			b = teclat.nextInt();

			switch (pregunta) {
			case "suma":
				int suma = a + b;
				System.out.println("Suma: " + suma);
				break;
			case "resta":
				int resta = a - b;
				System.out.println("Resta: " + resta);
				break;
			case "multiplicacion":
				int multiplicacion = a * b;
				System.out.println("Multiplicación: " + multiplicacion);
				break;
			case "division":
				int division = a / b;
				System.out.println("Division: " + division);
				break;
			case "potencia":
				int potencia = (int) Math.pow(a, b);
				System.out.println("Potencia: " + potencia);
				break;
			case "raizcuadrada":
				double raizA = Math.sqrt(a);
				double raizB = Math.sqrt(b);
				System.out.println("Raiz de a: " + raizA);
				System.out.println("Raiz de b: " + raizB);
				break;
			case "raizcubica":
				double raizAcub = Math.cbrt(a);
				double raizBcub = Math.cbrt(b);
				System.out.println("Raiz cubica de a: " + raizAcub);
				System.out.println("Raiz cubica de b: " + raizBcub);
				break;
			default:
				throw new ErrorCalc(123);
			}
		} catch (ErrorCalc e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Has introducido un valor no numerico!!");
		}		
	}
	
}
