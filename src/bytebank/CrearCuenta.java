package bytebank;

public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1,1);
        // primeraCuenta.saldo = 200;
        primeraCuenta.deposita(200);
        System.out.println(primeraCuenta.getSaldo());

        // primeraCuenta.saldo += 100;
        primeraCuenta.deposita(100);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(1,1);
        // segundaCuenta.saldo = 50;
        segundaCuenta.deposita(50);

        System.out.println("primera Cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda Cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta.getAgencia());
        System.out.println(primeraCuenta.getNumero());

        System.out.println(segundaCuenta.getAgencia());

        // segundaCuenta.agencia = 146;
        segundaCuenta.setAgencia(146);
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.getAgencia());

        if(primeraCuenta == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }

}
