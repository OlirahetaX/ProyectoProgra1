package InicioSesion;

public class InfoUsuario {

    public String usuario;
    public String password;
    public String celular;
    public String nombre;
    public String apellido;
    public double saldo=0.00;
    public int numcuenta;
    public InfoUsuario() {
    }


    public InfoUsuario(String nombre,String apellido, String usuario, String password, String celular,int numcuenta,double saldo ) {
        this.usuario = usuario;
        this.password = password;
        this.celular = celular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        this.numcuenta = numcuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public float getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellido;
    }

   

}
