package mainmenu;

import java.util.*;

public class Operaciones {

    Scanner entrada;
    public float valor = 0;
    public float valor2 = 0;
    public float valor3 = 0;

    public void Suma() {
        valor3 = valor + valor2;
        System.out.println("Usted eligio una suma y su valor es: " + valor3);
    }

    public void Resta() {
        valor3 = valor - valor2;
        System.out.println("Usted eligio una resta y su valor es: " + valor3);
    }

    public void Multiplicacion() {
        valor3 = valor * valor2;
        System.out.println("Usted eligio una multiplicacion y su valor es: " + valor3);
    }

    public void Division() {
        valor3 = valor / valor2;
        System.out.println("Usted eligio una division y su valor es: " + valor3);
    }

    public void Residuo() {
        valor3 = valor % valor2;
        System.out.println("Usted eligio residuo y su valor es: " + valor3);
    }

    public void Menor() {
        if (valor < valor2) {
            System.out.println("El valor 1 es menor");
        }
    }

    public void Mayor() {
        if (valor > valor2) {
            System.out.println("El valor 1 es mayor");
        }
    }

    public void Menorigualque() {
        if (valor <= valor2) {
            System.out.println("El valor 1 es menor igual que el 2");
        }
    }

    public void Mayorigualque() {
        if (valor >= valor2) {
            System.out.println("El valor 1 es mayor igual que el 2");
        }
    }

    public void Diferente() {
        if (valor != valor2) {
            System.out.println("El valor 1 si es diferente");
        } else {
            System.out.println("No son diferentes");
        }
    }

    public void Igual() {
        if (valor == valor2) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    public void AND() {
        if (valor2 != 0 && valor != 0) {
            System.out.println("Se cumple la condicion");
        } else {
            System.out.println("no cumple la condicion");
        }
    }

    public void OR() {
        if (valor == 5 || valor2 == 5) {
            System.out.println("Se cumple la condicion");
        } else {
            System.out.println("No se cumple la condicion");
        }
    }

    public void IF() {
        if (valor == 1) {
            System.out.println("Su valor es 1");
        } else {
            System.out.println("No entro en la condicion");
        }
    }

    public void Switch() {
        char x;
        do {
            System.out.println("a Para mensaje");
            System.out.println("b Para otro mensaje");
            System.out.println("0 Para salir");
            x = entrada.next().charAt(0);
            switch (x) {
                case 'a':
                    System.out.println("ella te ama");
                    break;
                case 'b':
                    System.out.println("ella no te ama");
                    break;
            }
        } while (x != '0');
    }

    public void While() {
        while (valor < 100) {
            valor++;
            System.out.println(valor);
        }
    }

    public void DoWhile() {
        do {
            valor++;
            System.out.println(valor);
        } while (valor < 100);
    }

    public void For() {
        for (int i = 0; i < 10; i++) {
            System.out.println(valor);
        }
    }
}
