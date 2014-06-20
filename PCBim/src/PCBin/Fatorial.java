package PCBin;

public class Fatorial {

	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int calcular(int numero){
		if (numero < 0) {
			throw new IllegalArgumentException();
		}
		return (numero * calcularFatorial(numero-1));
				
	}
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int calcularFatorial(int numero){
		if (numero <= 0) {
			return 1; 
		}else{
			return (numero * calcularFatorial(numero-1));
		}		
	}
}
