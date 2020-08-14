package bytebank;

public class TestCuentaConCliente {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego Rojas";
        diego.documento = "33442211";
        diego.telefono = "987654321";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.deposita(100);

        // cuentaDeDiego.titular = diego;
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
    
}
