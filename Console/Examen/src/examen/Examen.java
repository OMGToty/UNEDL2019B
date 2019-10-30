package examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner entrada = new Scanner(System.in);
    System.out.println("ingresa tus numeros");
        for (int i = 0; i < 5;) {
                array[i] = entrada.nextInt();
                if(array[i]<0){
            System.out.println("No ingresar numero negativos ");
        }else{
                    i++;
                }
      }
       
        Aritmetica objeto = new Aritmetica();
        System.out.println("Mi superclase es: Aritmetica");
        System.out.println("El promedio es: "+objeto.Promedio(array));
        System.out.println("La mediana es: "+objeto.Mediana(array));
    }

}
