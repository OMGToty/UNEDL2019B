
package Regla_Falsa_Trigonometrica;

public class Calcular_Regla_Falsa_Tri {
    //Objeto que conectará nuestra clase con los métodos para poder resolverlo
    Metodos_Regla_Falsa_Tri Metodos = new Metodos_Regla_Falsa_Tri();
    
    //Variables
    private Double intervaloA; //x0
    private Double intervaloB; //x1
    private Double errorEsperado;
    private int decimales;
    private Double x6=0.0;
    private Double x5=0.0;
    private Double x4=0.0;
    private Double x3=0.0;
    private Double x2=0.0;
    private Double x1=0.0;
    private Double constante=0.0;
    
    //Variables para trabajar
    private Double ecuacionIntervaloA = 0.0; //f(x0)
    private Double ecuacionIntervaloB; //f(x1)
    private Double Xr;
    private Double X;
    private Double aproximacionAnterior;
    private Double errorObtenido;
    public void CalcularReglaFalsa(String tipoFuncion, String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double interA, Double interB, Double error, int Deci, Double X6, Double X5, Double X4, Double X3, Double X2, Double X1, Double cons){
        System.out.println("Comprobación de valores: "+tipoFuncion);
        System.out.println("Ope7: "+ope7);
        System.out.println("Ope6: "+ope6);
        System.out.println("Ope5: "+ope5);
        System.out.println("Ope4: "+ope4);
        System.out.println("Ope3: "+ope3);
        System.out.println("Ope2: "+ope2);
        System.out.println("Ope1: "+ope1);
        System.out.println("Intervalo A: "+interA);
        System.out.println("Intervalo b: "+interB);
        System.out.println("Error: "+error);
        System.out.println("Decimales: "+Deci);
        System.out.println("X6: "+X6);
        System.out.println("X5: "+X5);
        System.out.println("X4: "+X4);
        System.out.println("X3: "+X3);
        System.out.println("X2: "+X2);
        System.out.println("X1: "+X1);
        System.out.println("Constante: "+cons+"\n");
        
        //Vaciamos los valores recibidos en las variables declaradas
        this.intervaloA = interA;
        this.intervaloB = interB;
        this.errorEsperado = error;
        this.decimales = Deci;
        this.x6 = X6;
        this.x5 = X5;
        this.x4 = X4;
        this.x3 = X3;
        this.x2 = X2;
        this.x1 = X1;
        this.constante = cons;
        
        //IntervaloA = x0
        //IntervaloB = x1
        //ecuacionIntervaloA = fx0;
        //ecuacionIntervaloB = fx1;
        
        //Calculamos la funcioncon nuestros intervalos
        ecuacionIntervaloA = Metodos.calcularEcuacionIntervaloA(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloA);
        ecuacionIntervaloB = Metodos.calcularEcuacionIntervaloB(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloB);
        System.out.println("Función Intervalo A SIN TIPO: "+ecuacionIntervaloA);
        System.out.println("Función Intervalo B SIN TIPO: "+ecuacionIntervaloB);
        //Le agregamos el tipo de funcion
        ecuacionIntervaloA = Metodos.tipoFuncion(tipoFuncion, ecuacionIntervaloA);
        ecuacionIntervaloB = Metodos.tipoFuncion(tipoFuncion, ecuacionIntervaloB);
        //Recortamos decimales
        ecuacionIntervaloA = Metodos.recortarDecimales(ecuacionIntervaloA, decimales);
        ecuacionIntervaloB = Metodos.recortarDecimales(ecuacionIntervaloB, decimales);
        System.out.println("Función Intervalo A: "+ecuacionIntervaloA);
        System.out.println("Función Intervalo B: "+ecuacionIntervaloB);
        
        //Guardamos la multiplicaciopn de los resultados de las euaciones
        Double condicionIntervalo = ecuacionIntervaloA*ecuacionIntervaloB;
        
        //Hacemos las condiciones correspondientes para ver donde se encuentra el valor que quiere obtener
        if(condicionIntervalo<0){
            System.out.println("- Sí, está la respuesta en este intervalo -");
        }
        else if(condicionIntervalo>0){
            System.out.println("- Busca otro intervalo -");
        }
        else{
            System.out.println("- ¡Felicidades!, encontraste el intervalo -");
        }
        
        //Calculamos la primer aproximacion y quitamos decimales
        Xr = Metodos.calcularXr(ecuacionIntervaloA, intervaloB, ecuacionIntervaloB, intervaloA);
        Xr = Metodos.recortarDecimales(Xr, decimales);
        
        //Mostramos la primera aproximacion
        System.out.println("\n -- Aproximación 1 -- ");
        System.out.println(" ----> "+Xr);
        
        //Cambiamos el valor de la variable
        aproximacionAnterior = Xr;
        intervaloA = Xr;
        ecuacionIntervaloA = Metodos.calcularEcuacionIntervaloA(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloA);
        ecuacionIntervaloA = Metodos.tipoFuncion(tipoFuncion, ecuacionIntervaloA);
        ecuacionIntervaloA = Metodos.recortarDecimales(ecuacionIntervaloA, decimales);
        System.out.println("Ecuacion intervalo A: "+ecuacionIntervaloA);
        
        //iniciamos con las iteraciones
        int cont=2;
        for(int i=0;i<50;i++){
            //Calculamos X y quitamos decimales
            X = Metodos.calcularXrn(ecuacionIntervaloB, intervaloA, intervaloB, ecuacionIntervaloA);
            X = Metodos.recortarDecimales(X, decimales);
            
            //calculamos el error
            errorObtenido = Metodos.calcularError(X, aproximacionAnterior);
            errorObtenido = Metodos.recortarDecimales(errorObtenido, decimales);
            aproximacionAnterior = X;
            
            System.out.println("\n -- Aproximacion "+cont+" -- ");
            System.out.println(" ----> "+X);
            System.out.println(" Error: "+errorObtenido+" %");
            
            //Cambio de variable
            intervaloA = X;
            ecuacionIntervaloA = Metodos.calcularEcuacionIntervaloA(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloA);
            ecuacionIntervaloA = Metodos.tipoFuncion(tipoFuncion, ecuacionIntervaloA);
            ecuacionIntervaloA = Metodos.recortarDecimales(ecuacionIntervaloA, decimales);
            System.out.println("Ecuacion intervalo A: "+ecuacionIntervaloA);
            
            //Condiciones para finalizar nuestro programa
            if(errorObtenido<=errorEsperado){
                System.out.println("- Fin de las iteraciones -");
                System.exit(0);
            }
            
            if(i==49){
                System.out.println("- Tiende a infinito -");
            }
            
            cont++;
        }
        
    }
}
