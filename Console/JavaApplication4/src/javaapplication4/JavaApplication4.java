
package javaapplication4;

import java.util.*;


public class JavaApplication4 {

 
        Scanner bn = new Scanner(System.in);
	double dNumeroRaiz = 0;
	double dPorcentaje = 0;
	int iNumeroDecimales = 0;

	public void SolicitarDatos() {
		do {
			dNumeroRaiz=0;

			try {
				System.out.println("Obtencion de raices cuadradas por metodos iterativos");
				System.out.println("Ingrese el numero que obtendra raiz: ");
				dNumeroRaiz = bn.nextFloat();
				System.out.println("Ingrese el porcentaje de error: ");
				dPorcentaje = bn.nextFloat();
				System.out.println("Numero de decimales: ");
				iNumeroDecimales = bn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("\n**Solo numeros por favor***\n");
			}
		} while (true);
	}

	int numCuadrado;
	boolean comparar = false;

	double x;
	double x2;

	double er;

	public void Operar() {
		int n = 0;
		do {
			n++;
			numCuadrado = (int) Math.pow(n, 2);
			if (numCuadrado > dNumeroRaiz) {
				comparar = true;
				n = n - 1;
			} else if (numCuadrado == dNumeroRaiz)
				comparar = true;
		} while (comparar == false);
		numCuadrado = (int) Math.pow(n, 2);

		if (numCuadrado == dNumeroRaiz) {
			System.out.println("--------------------------------");
			System.out.println("La raiz es: " + n + "\nCon un porcentaje de error del 0%");
		} else {
			System.out.println("------------------------------------");
			System.out.printf("Primera aproximacion es %d ", n);
			x = n;
			int decimales;
			decimales = (int) Math.pow(10, iNumeroDecimales);

			do {

				System.out.println("\n");
				x2 = 0.5 * (x + (dNumeroRaiz / x));
				System.out.println("La siguiente aproximacion es: "+(double) Math.round(x2 * decimales) / decimales);
				er = ((x2 - x) / x2) * 100;
				System.out.println("Con un error relativo del: " +(double) Math.abs((double) Math.round(er * decimales) / decimales)+"%");
				x = x2;

			} while (er > dPorcentaje);
			//x = (double) Math.round(x * decimales) / decimales;
			System.out.println("La raiz es: " +Math.abs( (double) Math.round(x2 * decimales) / decimales) + "\nCon un porcentaje de error del: " + (double) Math.abs((double) Math.round(er * decimales) / decimales) + "%");
		}

	}

	public static void main(String[] args) {
		JavaApplication4 imprimir = new JavaApplication4();
		imprimir.SolicitarDatos();
		imprimir.Operar();
	}
    }
    

