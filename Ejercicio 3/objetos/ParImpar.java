package objetos;

import java.util.Random;

public class ParImpar {
	
	// Atributos
	
	private int numRandom;
		
	// Metodos
	
	public void parImpar() {
		
		Random rnd = new Random();
		numRandom = rnd.nextInt(999) + 1;
		System.out.println(numRandom);
		
		try {
			if (numRandom % 2 != 0) {
				throw new MiErrorsito(222);
			} else {
				throw new MiErrorsito(111);
			}
			
		} catch (MiErrorsito e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// Setters & Getters
	
	public int getNumRandom() {
		return numRandom;
	}

	public void setNumRandom(int numRandom) {
		this.numRandom = numRandom;
	}
	
}
