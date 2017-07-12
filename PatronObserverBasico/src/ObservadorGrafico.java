import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

/**
 * Clase para definir un OBSERVADOR (muestra resultados en interfaz grafica)
 * Este estará atento cuando el observable cambie, para luego actualizar la información
 * @author pablo
 *
 */
public class ObservadorGrafico implements Observer { //Observador (Objeto que observará al observable)
	
	/**
	 * @param observable: Objeto que hace referencia al objeto observable el cual tuvo un cambio.
	 * @param value: Contiene el valor que ha cambiado
	 */
	@Override
	public void update(Observable observable, Object value) {
		JOptionPane.showMessageDialog(null, "La nueva tasa del dolar es: " + ((TasaDelDolar) observable).getTasaDelDolar(),
				"Tasa del dolar", JOptionPane.INFORMATION_MESSAGE);
	} 
	
}
