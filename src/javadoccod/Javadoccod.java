package javadoccod;

import javax.swing.JOptionPane;

/**
 * Descripcion: Este es un programa que va a realizar un saludo y ademas va a
 * mandar unos parametros para que los sume y los multiplique por 2 numero que
 * manda
 *
 * 
 *
 *
 *
 * @author Alex Urcera
 * @version 1.2
 */
public class Javadoccod {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @suma
         * @multip
         */
        int suma;
        double multip;

        /**
         * Saludo hola mundo
         */
        System.out.println("Hola mundo");

        /**
         * Declaramos un objeto y pedimos los numeros a los que deseamos
         * realizar las operaciones
         * aux pide un numero y lo manda para sumarlo +2
         * aux 2 pide un numero y lo manda para multipliccarlo por 2
         * para mandarlo al metodo lo mandamos con el obj.
         */
        claseuno obj = new claseuno();
        String aux = JOptionPane.showInputDialog("Dame el numero que quieras sumarle 2");
        suma = Integer.parseInt(aux);
        String aux2 = JOptionPane.showInputDialog("Dame el numero que quieras multiplicar por 2");
        multip = Integer.parseInt(aux);
        obj.sumamultiplica(suma, multip);
        
        

    }

}
