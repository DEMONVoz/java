/**
 * Created by 1610504 on 3/28/2018.
 */import java.util.Scanner;
public class laba2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 для заданих чисел або 1 для ввода з клавиатури : ");
        int k = in.nextInt();
        /**Введение чисел*/
        if ( k == 0) {
            int x = 2;
            double a = 0.01;
            double b = 5;
            double c = 4.1;
            System.out.println(Math.exp(-a*x) * Math.cos(b*x+c) + Math.exp(a*x) + Math.sin(c*x-1));
        }
        else if( k == 1)
        {
            System.out.print("Введите знаение х: ");
            int x = in.nextInt();
            System.out.print("Введите значения a: ");
            double a = in.nextDouble();
            System.out.print("Введите значения b: ");
            double b = in.nextDouble();
            System.out.print("Введите значения c: ");
            double c = in.nextDouble();
            System.out.println(Math.exp(-a*x) * Math.cos(b*x+c) + Math.exp(a*x) + Math.sin(c*x-1));
        }
        else{
            System.out.println("error");
        }
    }
}
