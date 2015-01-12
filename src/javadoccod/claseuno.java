/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoccod;

/**
 *Clase claseuno
 * 
 * @author Alex Urcera
 * @version 1.2
 */
public class claseuno {

    double multiplicacion;
    int suma;

    /**
     * Creamos un constructor
     */
    public claseuno() {
    }
/**
 * hacemos el getter Multiplicacion que devuelve double
 * @return 
 */
    public double getMultiplicacion() {
        return multiplicacion;
    }
/**
 * Hacemos el set multiplicacion para pedir el numero
 * @param multiplicacion 
 */
    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }
/**
 * hacemos el getter Multiplicacion que devuelve int
 * @return 
 */
    public int getSuma() {
        return suma;
    }
/**
 * Hacemos el set suma para pedir el numero
 * 
     * @param suma
 */
    public void setSuma(int suma) {
        this.suma = suma;
    }

    
    
    /**
     * El metodo va a recibir un numero y le va a sumar dos unidades y ademas va
     * a recibir otro numero y va a multiplicarlo por 2
     *
     * @param sum
     * @param multi
     */
    public void sumamultiplica(int sum, double multi) {
        this.suma = sum;
        multiplicacion = multi;

        suma = suma + 2;
        multiplicacion = multiplicacion * 2;

    }

}
