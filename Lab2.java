import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = 2;
        double a = 0.01;
        double b = 5;
        double c = 4.1;
        System.out.print("Введіть 0 для обчислення заданих чисел або 1 для вводу з клавіатури : ");
        int k = in.nextInt();
        if( k == 1)
        {
            System.out.print("Введите знаение х: ");
            x = in.nextInt();
            System.out.print("Введите значения a: ");
            a = in.nextDouble();
            System.out.print("Введите значения b: ");
            b = in.nextDouble();
            System.out.print("Введите значения c: ");
            c = in.nextDouble();
        }
        System.out.println(Math.exp(-a*x) * Math.cos(b*x+c) + Math.exp(a*x) + Math.sin(c*x-1));
    }
}
