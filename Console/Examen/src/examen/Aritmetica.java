package examen;

 class Aritmetica {
    int promedio;
    int mediana;

    public Aritmetica() {
        this.promedio=0;
    }

    public Aritmetica(int mediana) {
        this.mediana = mediana;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getMediana() {
        return mediana;
    }

    public void setMediana(int mediana) {
        this.mediana = mediana;
    }


  

    public int Promedio(int [] array) {
        for (int i = 0; i < array.length; i++) {
            promedio = (promedio + array[i]);
           
        }
        promedio= promedio /5;
        return promedio;
    }

    public int Mediana(int [] array ){
     
            mediana = mediana + array[2]; 
        
    return mediana;
    }
}
