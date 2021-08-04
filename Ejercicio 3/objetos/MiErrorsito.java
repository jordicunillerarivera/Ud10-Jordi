package objetos;

@SuppressWarnings("serial")
public class MiErrorsito extends Exception{

	private int codigoExcepction;
	
	// Constructores
	
	public MiErrorsito(int codigoExcepcion) {
		super();
		this.codigoExcepction = codigoExcepcion;
	}
	
	// Metodos
	
	@Override
	public String getMessage() {
		
		String mensaje="";
		
		switch (codigoExcepction) {
			case 111:
				mensaje = "El numero es par";
				break;
			case 222:
				mensaje = "El numero es impar";
				break;
	
			default:
				break;
			}
		
		
		return mensaje;
		
	}

		// Setters & Getters
	
	public int getCodigoExcepction() {
		return codigoExcepction;
	}

	public void setCodigoExcepction(int codigoExcepction) {
		this.codigoExcepction = codigoExcepction;
	}
	
}
