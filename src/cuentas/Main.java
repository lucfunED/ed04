package cuentas;

/**
 *
 * @author Luca
 * @version 1.0
 * 
 */
public class Main {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        CCuenta.operativa_cuenta(cuenta1, 50);
    }


}
