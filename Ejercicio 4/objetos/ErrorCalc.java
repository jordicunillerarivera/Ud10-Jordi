package objetos;

public class ErrorCalc extends Exception{
	private static final long serialVersionUID = 1L;
	private int codigoExcepcion;

	// constructor
	public ErrorCalc(int codigoError) {
		this.codigoExcepcion = codigoError;
	}

	// Metodo para mostrar el error
	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoExcepcion) {
		case 123:
			mensaje = "El calculo da error";
			break;

		default:
			mensaje = "El calculo da error";
			break;
		}

		return mensaje;
	}
}
