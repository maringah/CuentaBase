package cuenta.base;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 09 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */
public class CuentaAhorro extends CuentaBase {

    public CuentaAhorro(double apertura, String usuario, String contrasenia) {
        super(apertura, usuario, contrasenia);
    }

    public void invertir(double cantidad) {//El parametro no hace nada. ya que la inversion es fija del 10%
        System.out.println("Su monto actual es: "+this.getMontoActual());
        this.setMontoActual(this.getMontoActual() +this.getMontoActual()*0.1 );
        System.out.println("Su monto actual aumento un 10%, nuevo monto: "+this.getMontoActual());
    }

}
