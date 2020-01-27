package reglafalsatrigonometrica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JTextField;

public class Metodos_Regla_Falsa_Tri {
    //Método parea calcular intervalo en caso de ser Pi Radianes
    public Double CalcularIntervaloPiRadian(Double IntUp, Double IntDown){
        Double Intervalo;
        Intervalo = ((IntUp*3.1416)/IntDown);
        return Intervalo;
    }
    
    //Metodo para conertir a Radianes
    public Double ConvertirRadianes(Double Intervalo){
        Double resultado;
        resultado = ((Intervalo)*(3.1416))/180;
        return resultado;
    }
    
    public Double calcularEcuacionIntervaloA(String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double x6, Double x5, Double x4, Double x3, Double x2, Double x1, Double constante, Double intervaloA){
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
    
    public Double calcularEcuacionIntervaloB(String ope7, String ope6, String ope5, String ope4, String ope3, String ope2, String ope1, Double x6, Double x5, Double x4, Double x3, Double x2, Double x1, Double constante, Double intervaloB){
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
    
    public Double tipoFuncion(String tipoFuncion, Double funcion){
        Double resultado = 0.0;
        /*
        System.out.println("funcion sin conversion: "+funcion);
        funcion = Math.toRadians(funcion);
        System.out.println("funcion con conversion: "+funcion);
        */
        
        if(tipoFuncion.equals("Seno")){
            resultado = java.lang.Math.sin(funcion);
        }
        else if(tipoFuncion.equals("Coseno")){
            resultado = java.lang.Math.cos(funcion);
        }
        else if(tipoFuncion.equals("Tangente")){
            resultado = java.lang.Math.tan(funcion);
        }
        return resultado;
    }
    
    public Double calcularXr(Double fx0, Double x1, Double fx1, Double x0){
        Double Xr=0.0;
        Xr = (( (fx0*x1)-(fx1*x0) )/( fx0-fx1 ));
        
        return Xr;
    }
    
    public Double calcularXrn(Double fx1, Double x0, Double x1, Double fx0){
        Double Xrn=0.0;
        Xrn = x1-(( (fx1*x0)-(fx1*x1) )/( fx0-fx1 ));
        
        return Xrn;
    }
    
    public Double calcularError(Double aproximacion, Double aproximacionAnterior){
        Double error=0.0;
        error = ((aproximacion-aproximacionAnterior)/aproximacion)*100;
        
        if(error<0){
            error = error*-1;
        }
        return error;
    }
    
    public Double recortarDecimales(Double var, int decimales){
        //var = Math.abs(var);
        BigDecimal bd = new BigDecimal(var);
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
