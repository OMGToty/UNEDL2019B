/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridomatriz;

/**
 *
 * @author bab2p
 */
public class RecorridoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [][] MyMatriz = {{1,3,5,7},{4,7,9,7},{2,6,8,0},{2,4,5,2}};
        RecorridoN(MyMatriz);
 
    }
    public static void RecorridoN (int [][] MyMatriz){
        for (int i = 0; i < MyMatriz.length; i++) {
            for (int j = 0; j < MyMatriz[i].length; j++) {
                if((i%2)==0){
                    System.out.print(" "+ MyMatriz[j][i]);
            }else{
                    System.out.print(
                            "" +MyMatriz[MyMatriz.length-j-1][i]);
                }
            }
        }
    }
}
