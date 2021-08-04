package objetos;

public class Password {
	
	// Atributos
	
	private int longitud;
	public String contraseña;
	
	// Constante
	final private String key = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	// Constructor
	
		// Constructor vacio
	public Password() {
		this.longitud = 8;
		
		this.contraseña = generador(key, this.longitud);
		
	}
	
		// Constructor completo
	public Password(int longitud) {
		this.longitud = longitud;
		
		this.contraseña = generador(key, this.longitud);
		
	}

	// Metodos
	
		// Metodo para generar una contraseña aleatoria
	private String generador(String key, int longitud) {
		String pswd = "";
 
		for (int i = 0; i < longitud; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	
		// Metodo para regenerar la contraseña
	public void generarPassword() {
		this.contraseña = generador(key, this.longitud);
	}
	
	public boolean esFuerte() {
		
		if (esMayuscula() && esMinuscula() && esNumero()) {
			return true;
		}
		return false;
	}
	
		// Metodo para saber si tiene dos mayusculas minimo
	private boolean esMayuscula() {
		
		int cont = 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			if (Character.isUpperCase(contraseña.charAt(i))) {
				cont++;
				if (cont >= 2) {
					return true;
				}
			}
		} return false;
	}
	
	// Metodo para saber si tiene dos mayusculas minimo
	private boolean esMinuscula() {
	
		for (int i = 0; i < contraseña.length(); i++) {
			if (Character.isLowerCase(contraseña.charAt(i))) {
				return true;
			}
		} return false;
	}
	
	// Metodo para saber si tiene cinco o mas numeros
	private boolean esNumero() {
		
		int cont = 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			if (Character.isDigit(contraseña.charAt(i))) {
				cont++;
				if (cont >= 5) {
					return true;
				}
			}
		} return false;
	}
	
	@Override
	public String toString() {
		return contraseña;
	}
	
	// Getters & Setters

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

}
