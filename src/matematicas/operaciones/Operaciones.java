package matematicas.operaciones;

public class Operaciones {
    /**
     * sumar
     * Suma dos números y devuelve el resultado
     * @param a operando 1
     * @param b operando 2
     * @return resultado de la suma
     */
    public static int sumar(int a, int b){
        return a + b;
    }

    /**
     * restar
     * Resta dos números y devuelve el resultado
     * @param a operando 1
     * @param b operando 2
     * @return resultado de la resta
     */
    public static int restar(int a, int b){
        return sumar(a, -b);
    }

    /**
     * multiplicar
     * Multiplica dos números y devuelve el resultado
     * @param a operando 1
     * @param b operando 2
     * @return resultado de la multiplicación
     */
    public static int multiplicar(int a, int b){
        int multiplicacion = 0;
        for(int veces = 0; veces < b; veces++){
            multiplicacion = sumar(multiplicacion, a);
        }
        return multiplicacion;
    }

    /**
     * dividir
     * Divide dos números y devuelve el cociente de la división entera
     * @param a divisor
     * @param b dividendo
     * @return cociente de la división
     * @throws Exception
     */
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

    /**
     * resto
     * Divide dos números enteros y devuelve el resto de la división 
     * @param a divisor
     * @param b dividendo
     * @return resto de la división
     * @throws Exception lanza una excepción en caso de división por cero
     */
    public static int resto(int a, int b) throws Exception{
        if(b==0)
            throw new Exception("No se puede dividir entre 0");
        while(a>=b){
            a = restar(a, b);
        }
        return a;
    }

    /**
     * potencia
     * Devuelve la potencia de un número
     * @param a base de la potencia
     * @param b exponente de la potencia
     * @return valor de la potencia de a elevado a b
     */
    public static int potencia(int a, int b){
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
                return 0;
            }
        }
    }
    
}
