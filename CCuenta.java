/**
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto
 * @author Alberto C. Jimenez
 * @version 05/03/2023
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor generico 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor 
     * @param nom Nombre del titular
     * @param cue Cuenta
     * @param sal Salario
     * @param tipo Tipo
     * 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * estado 
     * @return Saldo
     * 
     */
    public double estado()
    {
        return saldo;
    }

    /**
     *  
     * @param cantidad Cantidad a ingresar
     * @return Saldo tras el ingreso
     * 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *  
     * @param cantidad Cantidad a retirar
     * @return Saldo tras el retirada
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
