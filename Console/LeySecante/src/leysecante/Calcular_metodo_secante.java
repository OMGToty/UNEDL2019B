package leysecante;

public class Calcular_metodo_secante {
        Metodos_Metodo_Secante metodos = new Metodos_Metodo_Secante();
        
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
        private Double funcionIntervaloA = 0.0; //f(x0)
        private Double funcionIntervaloB; //f(x1)
        private Double X;
        private Double aproximacionAnterior;
        private Double errorObtenido;
        
        public void CalcularSecante(String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double interA, Double interB, Double error, String Decimales, Double X6, Double X5, Double X4, Double X3, Double X2, Double X1, Double cons){
            //Vaciamos los valores recibidos en las variables declaradas
            this.intervaloA = interA;
            this.intervaloB = interB;
            this.errorEsperado = error;
            this.decimales = Integer.parseInt(Decimales);
            this.x6 = X6;
            this.x5 = X5;
            this.x4 = X4;
            this.x3 = X3;
            this.x2 = X2;
            this.x1 = X1;
            this.constante = cons;

            //IntervaloA = x0 - Xi-1
            //IntervaloB = x1 - Xi
            //funcionIntervaloA = fx0 - fxi-1;
            //funcionIntervaloB = fx1 - fxi;
            
            funcionIntervaloA = metodos.calcularFuncionIntervaloA(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloA);
            funcionIntervaloB = metodos.calcularFuncionIntervaloB(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloB);
            funcionIntervaloA = metodos.recortarDecimales(funcionIntervaloA, decimales);
            funcionIntervaloB = metodos.recortarDecimales(funcionIntervaloB, decimales);
            
            System.out.println("Resultados");
            System.out.println("Xi-1 = "+intervaloA);
            System.out.println("Xi = "+intervaloB);
            System.out.println("Fxi-1 = "+funcionIntervaloA);
            System.out.println("Fxi = "+funcionIntervaloB);
            //Double fxi, Double fxi1, Double xi, Double xi1
            X = metodos.CalcularX(funcionIntervaloB, funcionIntervaloA, intervaloB, intervaloA);
            X = metodos.recortarDecimales(X, decimales);
            System.out.println(" - Iteracion 1 - "); 
            System.out.println("--> "+X);
            
            int cont=2;
            
            for(int i=0;i<50;i++){
                //Cambio de intervalo
                Double compIntA=intervaloA;
                Double compIntB=intervaloB;
                Double pasaInt;
                Double X_anterior = X;
                
                //Comprobamos cuales serán nuestros nuevos intervalos
                if(intervaloA<intervaloB){
                    pasaInt = intervaloA;
                    if(pasaInt<X){
                        intervaloA = pasaInt;
                        intervaloB = X;
                    }
                    else if(X<pasaInt){
                        intervaloA = X;
                        intervaloB = pasaInt;
                    }
                }
                else if(intervaloB>intervaloA){
                    pasaInt = intervaloB;
                    if(pasaInt<X){
                        intervaloA = pasaInt;
                        intervaloB = X;
                    }
                    else if(X<pasaInt){
                        intervaloA = X;
                        intervaloB = pasaInt;
                    }
                }
                
                //Calculamos las fuciones
                funcionIntervaloA = metodos.calcularFuncionIntervaloA(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloA);
                funcionIntervaloB = metodos.calcularFuncionIntervaloB(ope7, ope6, ope5, ope4, ope3, ope2, ope1, x6, x5, x4, x3, x2, x1, constante, intervaloB);
                funcionIntervaloA = metodos.recortarDecimales(funcionIntervaloA, decimales);
                funcionIntervaloB = metodos.recortarDecimales(funcionIntervaloB, decimales);

                System.out.println("\n");
                System.out.println("Xi-1 = "+intervaloA);
                System.out.println("Xi = "+intervaloB);
                System.out.println("Fxi-1 = "+funcionIntervaloA);
                System.out.println("Fxi = "+funcionIntervaloB);
                
                //Calculamos X
                X = metodos.CalcularX(funcionIntervaloB, funcionIntervaloA, intervaloB, intervaloA);
                X = metodos.recortarDecimales(X, decimales);
                System.out.println(" - Iteracion "+cont+" - "); 
                System.out.println("--> "+X);
                
                errorObtenido = metodos.calcularError(X_anterior, X);
                errorObtenido = metodos.recortarDecimales(errorObtenido, decimales);
                System.out.println("Error: "+errorObtenido);
                
                //Condiciones para finalizar nuestro programa
                if(errorObtenido<=errorEsperado){
                    System.out.println("- Fin de las iteraciones -");
                    System.exit(0);
                }
            
                if(cont==200){
                    System.out.println("- Llegó a 200 iteraciones y aún no se encuentra la respuesta, puede requera más -");
                    System.exit(0);
                }

                cont++;
                i--;
            }
            
            
        }
}
