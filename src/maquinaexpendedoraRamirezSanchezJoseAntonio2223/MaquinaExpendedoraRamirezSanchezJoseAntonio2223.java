/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaexpendedoraRamirezSanchezJoseAntonio2223;

/**
 * Clase maquinaExpendedora
 * 
 * Esta clase representa una maquina expendedora que contiene un número limitado
 * de unidades dentro de ella, un precio para cada unidad que puede modificarse y
 * un precio máximo que no se puede sobrepasar.
 * 
 * @author Jose Antonio Ramirez Sanchez
 */
public class MaquinaExpendedoraRamirezSanchezJoseAntonio2223 {

    /**
     * Método get para obtener el precio
     * 
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método ser para modificar el precio
     * 
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * método get para obtener el precio máximo
     * 
     * @return the precio_maxRamirezSanchezJoseAntonio2223
     */
    public double getPrecio_maxRamirezSanchezJoseAntonio2223() {
        return precio_maxRamirezSanchezJoseAntonio2223;
    }

    /**
     * Método set para modificar el precio máximo
     * 
     * @param precio_maxRamirezSanchezJoseAntonio2223 the precio_maxRamirezSanchezJoseAntonio2223 to set
     */
    public void setPrecio_maxRamirezSanchezJoseAntonio2223(double precio_maxRamirezSanchezJoseAntonio2223) {
        this.precio_maxRamirezSanchezJoseAntonio2223 = precio_maxRamirezSanchezJoseAntonio2223;
    }
// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precio_maxRamirezSanchezJoseAntonio2223;//precio máximo que puede tener un snack

    /**
     * Constructor por defecto
     */
    public MaquinaExpendedoraRamirezSanchezJoseAntonio2223() {
    
    }
    
    
    /**
     * Constructor por parámetros
     * 
     * Crea un objeto maquinaExpendedora intoduciendole el número de unidades, el precio de cada unidad y
     * el precio máximo.
     * 
     * @param unidades número de snacks
     * @param precio precio de cada snack
     * @param precio_max precio máximo
     */
    public MaquinaExpendedoraRamirezSanchezJoseAntonio2223(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precio_maxRamirezSanchezJoseAntonio2223 = precio_max;
    }
    
    /**
     * Método que devuelve el número de snack que tiene la máquina
     * 
     * @return número de snacks de la máquina
     */
    public int obtenerUnidades() {
        return this.unidades;
    }

    /**
     * Método que devuelve el precio que tiene cada snack
     * 
     * @return precio de cada snack
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
    /**
      * Método que permite modificar el número de snack dsiponbles de la máquina
      * 
      * @param unidades número de snacks
      */
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    /**
    * Método que permite aumentar el precio de venta, suma al precio actual 
    * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
    * 
    * @param aumento numero añadido al precio
    * @throws Exception si aumento es negativo o si el precio supera el precio máximo al ser modificado
    */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxRamirezSanchezJoseAntonio2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
    /**
    * Método que permite obtener un snack si se tiene suficiente dinero y hay 
    * suficientes unidades en la máquina
    * 
    * @param unidades numero de snacks
    * @param dinero dinero usado para comprar snacks
    * @param regaloRamirezSanchezJoseAntonio2223 parametro introducido para la tarea
    * @throws Exception si el dinero es negativo, el dinero no es suficiente, si la cantidad de snacks
    * es 0 y si no hay suficiente snacks.
    */
    public void sacarsnack(int unidades, double dinero, String regaloRamirezSanchezJoseAntonio2223) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

}
