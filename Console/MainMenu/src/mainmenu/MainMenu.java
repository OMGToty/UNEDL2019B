package mainmenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Operaciones objeto = new Operaciones();
        objeto.entrada = new Scanner(System.in);
        char x;
        do{
          
        System.out.println("digite su valor 1: ");
        objeto.valor = objeto.entrada.nextFloat();
        System.out.println("Digite su valor 2: ");
        objeto.valor2 = objeto.entrada.nextFloat();
       
        if(objeto.valor>100&&objeto.valor<0||objeto.valor2>100&&objeto.valor2<0);
            System.out.println("digite valores menores a 100 y mayores a 0");
        }while(objeto.valor>100||objeto.valor<0||objeto.valor2>100||objeto.valor2<0);
        do {
            System.out.println("+ para suma");
            System.out.println("- para resta");
            System.out.println("* para multiplicacion");
            System.out.println("/ para division");
            System.out.println("% para residuo");
            System.out.println("< para menor");
            System.out.println("m para menor igual que");
            System.out.println("M mayor igual que");
            System.out.println("> para mayor");
            System.out.println("! para diferente");
            System.out.println("= para comparacion");
            System.out.println("& operador AND");
            System.out.println("| Para disyuncion");
            System.out.println("I Para if");
            System.out.println("S para switch");
            System.out.println("W para while");
            System.out.println("D para do-while");
            System.out.println("F para for");
            System.out.println("0 para salir");
            x = objeto.entrada.next().charAt(0);
            switch (x) {
                case '+':
                    objeto.Suma();
                    break;
                case '-':
                    objeto.Resta();
                    break;
                case '*':
                    objeto.Multiplicacion();
                    break;
                case '/':
                    objeto.Division();
                    break;
                case '%':
                    objeto.Residuo();
                    break;
                case '<':
                    objeto.Menor();
                    break;
                case 'm':
                    objeto.Menorigualque();
                    break;
                case '>':
                    objeto.Mayor();
                    break;
                case 'M':
                    objeto.Mayorigualque();
                    break;
                case '!':
                    objeto.Diferente();
                    break;
                case '=':
                    objeto.Igual();
                    break;
                case '&':
                    objeto.AND();
                    break;
                case '|':
                    objeto.OR();
                    break;
                case 'I':
                    objeto.IF();
                    break;
                case 'S':
                    objeto.Switch();
                    break;
                case 'W':
                    objeto.While();
                    break;
                case 'D':
                    objeto.DoWhile();
                    break;
                case 'F':
                    objeto.For();
                    break;
                default:
                    if(x!='0'){
                           System.out.println("Dato no valido"); 
                    }else{
                    
                    }
            }
        } while (x != '0');
    }

}
