package cuenta.base;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 09 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class TarjetaCredito extends CuentaBase {

    private double deuda;
    public TarjetaCredito(double apertura, String usuario, String contrasenia) {//Apertura es el saldo.
        super(apertura, usuario, contrasenia);
        deuda = apertura;
    }
    

    public void sumaInteres(double cantidad){//Se crea con parametro aunque no se use por el diagrama. 
        System.out.println("Su deuda actual es de :"+this.deuda);
        this.deuda = this.deuda + this.deuda*0.15;
        System.out.println("La deuda ha subido a " + this.deuda);
    }
    
    public double getDeuda(){
        return this.deuda;
    }

}
