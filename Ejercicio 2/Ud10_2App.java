import javax.swing.JOptionPane;

import objetos.MiErrorsito;

public class Ud10_2App {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1"));
		
		try {
			if (num != 1) {
				throw new MiErrorsito(111);
			} else {
				System.out.println("Perfecto");
			}
		} catch (MiErrorsito e) {
			System.out.println(e.getMessage());
		}
		
	}

}
