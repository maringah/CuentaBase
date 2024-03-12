 package cuenta.base;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 09 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class CuentaBase {

    private double montoActual;
    private String usuario;
    private String contrasenia;

    public CuentaBase() {
    }

    public CuentaBase(double montoActual, String usuario, String contrasenia) {
        this.montoActual = montoActual;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public void depositar(double cantidad) {
        this.montoActual = this.montoActual + cantidad;

        System.out.println("Usted realizo el deposito de: " + cantidad);
        System.out.println("Su saldo actual es: " + this.montoActual);
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    
    public void retirar(double cantidad) {
        if (cantidad >= 0) {
            if (this.montoActual >= cantidad) {
                this.montoActual = this.montoActual - cantidad;
                System.out.println("Usted realizó el retiro de: " + cantidad);
                System.out.println("Su saldo actual es: " + this.montoActual);
            } else {
                System.out.println("Error: Saldo insuficiente para realizar el retiro.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar no puede ser negativa.");
        }
    }
     
}
