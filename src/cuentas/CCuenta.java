package cuentas;
        
/**
 *
 * @author Luca
 * @version 1.0
 * 
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    /**
     *
     */
    public CCuenta() {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }


    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    
    /**
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    
    /**
     *
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    
    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    /**
     *
     * @return getSaldo
     */
    public double estado() {
        return getSaldo();
    }

    
    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    /**
     *
     * @param cuenta
     * @param cantidad
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }     
    }
    
}
