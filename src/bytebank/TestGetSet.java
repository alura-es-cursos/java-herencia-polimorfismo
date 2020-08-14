package bytebank;

public class TestGetSet {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.setNumero(1337);
        System.out.println(cuenta.getNumero());

        Cliente diego = new Cliente();
        diego.setNombre("Diego Rojas");

        cuenta.setTitular(diego);

        System.out.println(cuenta.getTitular().getNombre());

        cuenta.getTitular().setTelefono("9944332211");
        //ahora en dos lineas
        Cliente titular = cuenta.getTitular();
        titular.setTelefono("9944332211");

        System.out.println(titular);
        System.out.println(diego);
        System.out.println(cuenta.getTitular());
    }
}
