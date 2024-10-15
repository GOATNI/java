import java.text.DecimalFormat;
import java.util.Scanner;
public class eje8_ud2{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("###.####");
        double num1,num2;
        System.out.println("ingresa el primer numero:");
        num1 = sn.nextDouble();
        System.out.println("ingresa el otro numero:");
        num2 = sn.nextDouble();
        double value  = num1/num2;
        
        String result = decimalFormat.format(value);
        System.out.println(""+result);



    }
}