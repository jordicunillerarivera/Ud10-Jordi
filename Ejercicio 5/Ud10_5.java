import javax.swing.JOptionPane;

import objetos.Password;

public class Ud10_5 {

	public static void main(String[] args) {
		
		Password contraseñas[] = generarArray();
		Boolean sonFuertes[] = sonFuertes(contraseñas);
		mostrar(contraseñas, sonFuertes);
		
	}
	
	// Metodo que genera una array de contraseñas
	public static Password[] generarArray() {
		
		Password contraseñas[] = null;
		int longitud = 0;
		
		try {
			contraseñas = new Password[Integer.parseInt(JOptionPane.showInputDialog("Cuantas contraseñas desea almacenar"))];
			longitud = Integer.parseInt(JOptionPane.showInputDialog("Cual sera la longitud de las contraseñas"));
			
			for (int i = 0; i < contraseñas.length; i++) {
				
				Password aux = new Password(longitud);
				contraseñas[i] = aux;
				
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto");;
			generarArray();
		}
		return contraseñas;
	}
	
	// Metodo que genera una array de booleanos haciendo referencia a contraseñas
	public static Boolean[] sonFuertes(Password[] contraseñas) {
		
		Boolean sonFuertes[] = new Boolean[contraseñas.length];
		
		for (int i = 0; i < contraseñas.length; i++) {
			if(contraseñas[i].esFuerte()) {
				sonFuertes[i] = true;
			} else {
				sonFuertes[i] = false;
			}
		}
		return sonFuertes;
	}
	
	// Metodo para mostrar por pantalla los dos arrays en conjunto
	public static void mostrar(Password[] contraseñas, Boolean[] sonFuertes) {
		
		for (int i = 0; i < contraseñas.length; i++) {
			System.out.println(contraseñas[i].toString() + " " + sonFuertes[i]);
		}
		
	}

}
