import java.util.Scanner;

public class eje6_ud2{
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("ingreasa un numero intero");
        int num1 = sn.nextInt();
        System.out.println("Ingresa el 2 numero intero");
        int num2 = sn.nextInt();
        System.out.println( "el numero 1 es mayor que numero 2 ? " + ( num1 > num2) + "¿El numero mayor es el multiplo de menor?" + (num1%num2 == 0 ));
        System.out.println( "el numero 2 es mayor que numero 1 ? " + ( num1 < num2)  + "¿El numero mayor es el multiplo de menor?" + (num2%num1 == 0 ));

        
        
    }

}
