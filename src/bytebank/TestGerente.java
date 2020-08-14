package bytebank;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);
		
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
	}
	
}
