import java.util.Scanner;
public class lab2_new {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 для заданих чисел або 1 для ввода з клавиатури : ");
        int k = in.nextInt();
        double x = 2;
        double a = 0.01;
        double b = 5;
        double c = 4.1;
        double F = Math.exp(-a*x) * Math.cos(b*x+c) + Math.exp(a*x) + Math.sin(c*x-1);
        /**Введение чисел*/
        if (k == 0) {           
            System.out.println(F + "F ");
        }
        else if( k == 1)
        {
            System.out.print("Введите знаение х: ");
            x = in.nextInt();
            System.out.print("Введите значения a: ");
            a = in.nextDouble();
            System.out.print("Введите значения b: ");
            b = in.nextDouble();
            System.out.print("Введите значения c: ");
            c = in.nextDouble();
            System.out.println(F + "F ");
        }
        else{
            System.out.println("error");
        }
    }
}
