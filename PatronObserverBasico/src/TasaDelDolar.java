import java.util.Observable;

/**
 * Clase que referenica la tasa del dolar
 * La idea con el patron observer es que una vez que la tasa del dolar
 * cambie, automaticamente todos los OBSERVADORES podrán actualiza la información
 * @author pablo
 *
 */
public class TasaDelDolar extends Observable { //Observable (Objeto que será obserado)
	
	private double tasaDelDolar;
	
	
	
	public double getTasaDelDolar() {
		return tasaDelDolar;
	}

	public void setTasaDelDolar(double tasaDelDolar) {
		this.tasaDelDolar = tasaDelDolar;
		
		//Se indica que la tasa del dolar ha cambiado
		setChanged(); //Metodo protegido de la clase Observable
	}
	
}
