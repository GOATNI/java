import java.util.Scanner;

public class eje7_ud2{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("ingresa me un numero: ");
        int num1 = sn.nextByte();
        System.out.println("ingrea el otro: ");
        int num2 = sn.nextByte();
        int producto = num1*num2 ;
        System.out.println(""+ producto);
        

        
    }
}