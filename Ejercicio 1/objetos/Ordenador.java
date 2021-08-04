package objetos;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Ordenador {
	
	// Atributos
	
	private int num;
	private int cont;
	
	// Constructores
	
	public Ordenador() {
		num = (int) (Math.random() * 500 + 1);
		cont = 1;
	}
	
	// Metodos
	
	public void adivinar() {
		
		try {
			int numIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			if (numIntroducido != num && numIntroducido > num) {
				System.out.println("El numero es menor");
				cont++;
				adivinar();
			} else if (numIntroducido != num && numIntroducido < num) {
				System.out.println("El numero es mayor");
				cont++;
				adivinar();
			} else {
				System.out.println("Felicidades!\nTe ha tomado " + cont + " intentos");
			}
		} catch (InputMismatchException e) {
			System.out.println("Has introducido un valor incorrecto");
			adivinar();
		} catch (NumberFormatException e) {
			System.out.println("Has introducido un valor incorrecto");
			adivinar();
		}
	}
	
	// Setters & Getters
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
}
