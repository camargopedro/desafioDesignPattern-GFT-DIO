package one.dio.desafioGFT4;

/**
 * Singleton "apressado"
 * 
 * @author Pedro Camargo
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();

	}

	public static SingletonEager getInstancia() {
		return instancia;
	}

}
