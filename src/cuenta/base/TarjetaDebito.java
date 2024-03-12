package cuenta.base;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 09 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class TarjetaDebito extends CuentaBase {

    public TarjetaDebito(double apertura, String usuario, String contrasenia) {
        super(apertura, usuario, contrasenia);
    }

    public void retirar(double cantidad) {
        System.out.println("Su saldo actual es de :"+ getMontoActual());
        if (cantidad >= 0) {
            if (this.getMontoActual() >= cantidad) {
                //monto = monto - cantidad a retirar
                this.setMontoActual(this.getMontoActual() - cantidad);
                System.out.println("Usted realizo el retiro de: " + cantidad);
                System.out.println("Su saldo actual es: " + this.getMontoActual());
            } else {
                System.out.println("Error: Fondos Insuficientes.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar no puede ser negativa.");
        }
    }
}
