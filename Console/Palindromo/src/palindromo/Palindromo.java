
package palindromo;

import java.util.*;


public class Palindromo {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra = "";
        char[] palabra2 = new char[50];
        String aux = "";
        String aux2 = "";
        String palabraop ="";
        System.out.println("Escriba su palabra");
        palabra = entrada.nextLine();
        palabraop = palabra.replace(" ","");
       int longitud = palabra.length();
        palabra2 = palabra.toCharArray();
       
        for (int i = longitud-1; i >= 0 ; i--) {
            aux = aux + palabra2[i];
            }
        aux2= aux.replace(" ","");
        System.out.println("\n");
        System.out.println("original "+palabraop.trim());
        System.out.println("auxiliar "+aux2.trim());
        if(palabraop.trim().equals(aux2.trim())){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
 
    }
    
}
