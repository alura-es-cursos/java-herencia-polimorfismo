package bytebank;

public class Contador extends Funcionario {

	@Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return 200;
	}
}
