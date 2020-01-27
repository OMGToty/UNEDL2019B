package leysecante;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Metodos_Metodo_Secante {
    public Double calcularFuncionIntervaloA(String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double x6, Double x5, Double x4, Double x3, Double x2, Double x1, Double constante, Double intervaloA){
        Double ecuacionIntervaloA;
        x6 = x6*Math.pow(intervaloA, 6);
        x5 = x5*Math.pow(intervaloA, 5);
        x4 = x4*Math.pow(intervaloA, 4);
        x3 = x3*Math.pow(intervaloA, 3);
        x2 = x2*Math.pow(intervaloA, 2);
        x1 = x1*intervaloA;
        
        //Comprobamos si un operador era negativo, en caso de serlo se multiplica por -1 para pasarloo a negativo
        if(ope7.equals("-")){
            x6 = (x6)*(-1);
        }
        if(ope6.equals("-")){
            x5 = (x5)*(-1);
        }
        if(ope5.equals("-")){
            x4 = (x4)*(-1);
        }
        if(ope4.equals("-")){
            x3 = (x3)*(-1);
        }
        if(ope3.equals("-")){
            x2 = (x2)*(-1);
        }
        if(ope2.equals("-")){
            x1 = (x1)*(-1);
        }
        if(ope1.equals("-")){
            constante = (constante)*(-1);
        }
        
        ecuacionIntervaloA = x6+x5+x4+x3+x2+x1+constante;
            return ecuacionIntervaloA;
    }
    
    public Double calcularFuncionIntervaloB(String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double x6, Double x5, Double x4, Double x3, Double x2, Double x1, Double constante, Double intervaloB){
        Double ecuacionIntervaloB;

        x6 = x6*Math.pow(intervaloB, 6);
        x5 = x5*Math.pow(intervaloB, 5);
        x4 = x4*Math.pow(intervaloB, 4);
        x3 = x3*Math.pow(intervaloB, 3);
        x2 = x2*Math.pow(intervaloB, 2);
        x1 = x1*intervaloB;
        
        //Comprobamos si un operador era negativo, en caso de serlo se multiplica por -1 para pasarloo a negativo
        if(ope7.equals("-")){
            x6 = (x6)*(-1);
        }
        if(ope6.equals("-")){
            x5 = (x5)*(-1);
        }
        if(ope5.equals("-")){
            x4 = (x4)*(-1);
        }
        if(ope4.equals("-")){
            x3 = (x3)*(-1);
        }
        if(ope3.equals("-")){
            x2 = (x2)*(-1);
        }
        if(ope2.equals("-")){
            x1 = (x1)*(-1);
        }
        if(ope1.equals("-")){
            constante = (constante)*(-1);
        }
        
        ecuacionIntervaloB = x6+x5+x4+x3+x2+x1+constante;
        return ecuacionIntervaloB;
    }
    
    public Double CalcularX(Double fxi, Double fxi1, Double xi, Double xi1){
        Double x= 0.0;
        Double sup;
        Double inf;
        sup = ( (fxi)*(xi1-(xi)) );
        inf = ( (fxi1-(fxi)) );
        x = xi - (sup/inf);
        
        return x;
    }
    
    public Double recortarDecimales(Double var, int decimales){
        //var = Math.abs(var);
        BigDecimal bd = new BigDecimal(var);
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public Double calcularError(Double aproximacionAnterior, Double aproximacion){
        Double error=0.0;
        error = ((aproximacion-aproximacionAnterior)/aproximacion)*100;
        
        if(error<0){
            error = error*-1;
        }
        return error;
    }
}
