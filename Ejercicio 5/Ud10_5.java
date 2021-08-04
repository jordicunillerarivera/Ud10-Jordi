import javax.swing.JOptionPane;

import objetos.Password;

public class Ud10_5 {

	public static void main(String[] args) {
		
		Password contrase�as[] = generarArray();
		Boolean sonFuertes[] = sonFuertes(contrase�as);
		mostrar(contrase�as, sonFuertes);
		
	}
	
	// Metodo que genera una array de contrase�as
	public static Password[] generarArray() {
		
		Password contrase�as[] = null;
		int longitud = 0;
		
		try {
			contrase�as = new Password[Integer.parseInt(JOptionPane.showInputDialog("Cuantas contrase�as desea almacenar"))];
			longitud = Integer.parseInt(JOptionPane.showInputDialog("Cual sera la longitud de las contrase�as"));
			
			for (int i = 0; i < contrase�as.length; i++) {
				
				Password aux = new Password(longitud);
				contrase�as[i] = aux;
				
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto");;
			generarArray();
		}
		return contrase�as;
	}
	
	// Metodo que genera una array de booleanos haciendo referencia a contrase�as
	public static Boolean[] sonFuertes(Password[] contrase�as) {
		
		Boolean sonFuertes[] = new Boolean[contrase�as.length];
		
		for (int i = 0; i < contrase�as.length; i++) {
			if(contrase�as[i].esFuerte()) {
				sonFuertes[i] = true;
			} else {
				sonFuertes[i] = false;
			}
		}
		return sonFuertes;
	}
	
	// Metodo para mostrar por pantalla los dos arrays en conjunto
	public static void mostrar(Password[] contrase�as, Boolean[] sonFuertes) {
		
		for (int i = 0; i < contrase�as.length; i++) {
			System.out.println(contrase�as[i].toString() + " " + sonFuertes[i]);
		}
		
	}

}
