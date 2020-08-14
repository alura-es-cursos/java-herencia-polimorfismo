package bytebank;

public class Gerente extends Funcionario {

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return super.getSalario();
    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
