
public class Sistema {

	public static void main(String[] args) {
		
		TasaDelDolar tasa = new TasaDelDolar();
		ObservadorDeConsola observadorDeConsola = new ObservadorDeConsola();
		ObservadorGrafico observadorGrafico = new ObservadorGrafico();
		
		//Al objeto tasa se le agregan los OBSERVADORES
		tasa.addObserver(observadorDeConsola);
		tasa.addObserver(observadorGrafico);
		
		//Se invoca al metodo setChanged() el cual esta contenido en el metodo setTasaDelDolar()
		//setChanged(): Es el encargado establecer que hubo un cambio
		tasa.setTasaDelDolar(10);
		
		//Se notifica a todos los OBSERDADORES
		//(Al notificarse se llama al metodo udpate() el cual esta sobreescrito en cada 
		//uno de los OBSERVADORES)
		tasa.notifyObservers();
	}

}
