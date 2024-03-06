package cuentas;

/**
 * Clase que simboliza una cuenta bancaria
 * @author Enrique
 * @version 2.0
 * @since 2.0
 */

public class CCuenta {
	/**
	 * Atributo para almacenar el titular de la cuenta
	 */
private String nombre;
/**
 * Atributo para almacenar el número de cuenta
 */
private String cuenta;
/**
 * Atributo para almacenar el saldo de la cuenta
 */
private double saldo;
/**
 * Atributo para almacenar el tipo de interés
 */
private double tipoInterés;

/**
 * Método constructor de la clase CCuenta sin parámetros
 */

public CCuenta()
{
}

/**
 * Método constructor de la clase CCuenta con parámetros
 * @param Titular de la cuenta 
 * @param Número de cuenta
 * @param Saldo de la cuenta
 * @param Tipo de interés
 */

public CCuenta(String nom, String cue, double sal, double tipo)
{
    setNombre(nom);
    setCuenta(cue);
    setSaldo(sal);
}

/**
 * Este método getter permite obtener el saldo bancario
 * @return el saldo de la cuenta
 */

public double estado()
{
    return getSaldo();
}

/**
 * Método que permite ingresar dinero para aumentar el saldo de la cuenta
 * @param Cantidad a ingresar
 * @throws Arroja una excepción cuando se intenta ingresar una cantidad negativa
 */

public void ingresar(double cantidad) throws Exception
{
    if (cantidad<0)
        throw new Exception("No se puede ingresar una cantidad negativa");
    setSaldo(getSaldo() + cantidad);
}

/**
 * Método retirar, que permite sacar dinero de la cuenta bancaria
 * @param Cantidad a retirar
 * @throws Arroja una excepción al intentar sacar una cantidad 
 * negativa o sacar más dinero del que hay en la cuenta
 */

public void retirar(double cantidad) throws Exception
{
    if (cantidad <= 0)
        throw new Exception ("No se puede retirar una cantidad negativa");
    if (estado()< cantidad)
        throw new Exception ("No hay suficiente saldo");
    setSaldo(getSaldo() - cantidad);
}

/**
 * Este método getter permite obtener el nombre y primer apellido del titular de la cuenta
 * @return el nombre y primer apellido del titular de la cuenta
 */

private String getNombre() {
	return nombre;
}

/**
*Método setter que permite introducir el nombre del titular de la cuenta
 * @param Titular de la cuenta
 */

private void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * Este método getter permite obtener el número de cuenta
 * @return el número de cuenta
 */

private String getCuenta() {
	return cuenta;
}

/**
*Método setter que permite introducir el número de cuenta
 * @param Número de cuenta
 */
private void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}

/**
 * Este método getter permite obtener el saldo restante
 * @return el saldo restante
 */

private double getSaldo() {
	return saldo;
}

/**
*Método setter que permite introducir el saldo en la cuenta
 * @param Saldo en la cuenta bancaria
 */

private void setSaldo(double saldo) {
	this.saldo = saldo;
}

/**
 * Este método getter permite obtener el tipo de interés
 * @return el tipo de interés
 */

private double getTipoInterés() {
	return tipoInterés;
}
/**
*Método setter que permite introducir el tipo de interés
 * @param Tipo de interés
 */
private void setTipoInterés(double tipoInterés) {
	this.tipoInterés = tipoInterés;
}
}
