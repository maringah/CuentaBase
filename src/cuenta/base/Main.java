package cuenta.base;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 09 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */


public class Main {

    public static void main(String[] args) {

        // Usuario 1 - Tarjeta de Credito
        TarjetaCredito tarjetaCreditoUsuario1 = new TarjetaCredito(1000, "usuario1", "contrasenia1");
        tarjetaCreditoUsuario1.depositar(500);
        tarjetaCreditoUsuario1.sumaInteres(0); // El parametro no se usa en este caso
        System.out.println("");
        
        // Usuario 2 - Tarjeta de Debito
        TarjetaDebito tarjetaDebitoUsuario2 = new TarjetaDebito(1500, "usuario2", "contrasenia2");
        tarjetaDebitoUsuario2.retirar(200);
        tarjetaDebitoUsuario2.retirar(1800); // Intentar retirar mas de lo que hay en la cuenta

        System.out.println("");
        // Usuario 3 - Cuenta de Ahorro
        CuentaAhorro cuentaAhorroUsuario3 = new CuentaAhorro(2000, "usuario3", "contrasenia3");
        cuentaAhorroUsuario3.invertir(0); // El parametro no se usa en este caso
        cuentaAhorroUsuario3.depositar(100);

        // Mostrar estado final de las cuentas por usuario
        System.out.println("Estado final de la tarjeta de credito del Usuario 1: Saldo = " + tarjetaCreditoUsuario1.getMontoActual()
                + ", Deuda = " + tarjetaCreditoUsuario1.getDeuda());

        System.out.println("Estado final de la tarjeta de debito del Usuario 2: Saldo = " + tarjetaDebitoUsuario2.getMontoActual());

        System.out.println("Estado final de la cuenta de ahorro del Usuario 3: Saldo = " + cuentaAhorroUsuario3.getMontoActual());
    }
}
