package bytebank;

public class TestReferencias {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        // primeraCuenta.saldo = 300;
        primeraCuenta.deposita(300);

        System.out.println("saldo de primera cuenta : " + primeraCuenta.getSaldo());

        Cuenta segundaCuenta = primeraCuenta;

        System.out.println("saldo de segunda Cuenta: " + segundaCuenta.getSaldo());

        // segundaCuenta.saldo += 100;
        segundaCuenta.deposita(100);
        System.out.println("saldo de segunda Cuenta " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta.getSaldo());

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Es la misma cuenta");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
    
}
