/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicar;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num;
        
        System.out.println("Ingrese Numero");
        Scanner N = new Scanner (System.in);
        Num = N.nextInt();
        
        for(int n = 0;  n<= 10; n++) {
            System.out.println(n+"="+ Num*(n));
        }
    }
    
}
