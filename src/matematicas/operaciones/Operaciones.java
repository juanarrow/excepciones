package matematicas.operaciones;

public class Operaciones {
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return sumar(a, -b);
    }

    public static int multiplicar(int a, int b){
        int multiplicacion = 0;
        for(int veces = 0; veces < b; veces++){
            multiplicacion = sumar(multiplicacion, a);
        }
        return multiplicacion;
    }

    public static int dividir(int a , int b) throws Exception{
        if(b==0)
            throw new Exception("No se puede dividir entre 0");
        int veces = 0;
        while(a>=b){
            a = restar(a, b);
            veces++;
        }
        return veces;
    }

    public static int resto(int a, int b) throws Exception{
        if(b==0)
            throw new Exception("No se puede dividir entre 0");
        while(a>=b){
            a = restar(a, b);
        }
        return a;
    }

    public static int potencia(int a, int b) throws Exception{
        if(b==0)
            return 1;
        else if(b>0){
            int potencia = 1;
            for(int veces=0;veces<b;veces++)
                potencia = multiplicar(potencia,a);
            return potencia;
        }
        else{
            try {
                return dividir(1,  potencia(a, -b));
            } catch (Exception e) {
                throw e;
            }
        }
    }
    
}
