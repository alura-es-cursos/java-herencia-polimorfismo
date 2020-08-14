package bytebank;

public class TestValores {

    public static void main(String[] args) {
        //  Cuenta cuenta = new Cuenta();
        //  cuenta.setAgencia(-50);
        //  cuenta.setNumero(-330);

        Cuenta cuenta = new Cuenta(1337, 24226);

        System.out.println(cuenta.getAgencia());
        cuenta.setAgencia(1232123);

        Cuenta cuenta2 = new Cuenta(1337, 16549);
        Cuenta cuenta3 = new Cuenta(2112, 14660);

        System.out.println(Cuenta.getTotal());

    }
}
