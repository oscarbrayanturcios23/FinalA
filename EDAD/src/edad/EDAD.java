/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int AÑO;
        String Nombre="";
        
        System.out.println("Ingrese Edad");
        Scanner A = new Scanner (System.in);
        AÑO = A.nextInt();
        
        System.out.println("Ingrese Nombre");
        Scanner N = new Scanner (System.in);
        Nombre = N.nextLine();
        
        System.out.println("Edad: "+ AÑO+" Nombre: "+ Nombre);
        
        if (AÑO>=18)
            System.out.println("Tiene DPI");
        else
            System.out.println("Es un niño");
    }
    
}
