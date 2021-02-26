/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial66219;

/**
 *
 * @author chent
 */
public class Factorial66219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 1;
        int factorial= 1;
           System.out.println("la lista es de:" );
        while (cont <=15){
           
              System.out.println(cont );
            factorial*= cont;
            cont++;
        }
    
        System.out.println("El factorial es igual a :" + factorial);
    }
    
}
