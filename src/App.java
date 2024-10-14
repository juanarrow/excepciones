import java.util.Scanner;

import matematicas.operaciones.Operaciones;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sumar dos números");
        System.out.print("Introduzca un numero: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca otro numero: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d + %d = %d",a, b, Operaciones.sumar(a, b));
        scanner.close();
        
    }
}
