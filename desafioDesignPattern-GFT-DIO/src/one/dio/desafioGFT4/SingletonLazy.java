package one.dio.desafioGFT4;

/**
 * Singleton "pregui�oso"
 * 
 * @author Pedro Camargo
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();

	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();

		}
		return instancia;
	}

}
