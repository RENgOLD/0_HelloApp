import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = in.nextInt();

        System.out.print("Введите второе число:");
        int num2 = in.nextInt();

        if (num1 > num2) System.out.print("Первое число больше второго.");
        else if (num2 > num1) System.out.print("Второе число больше первого.");
        else System.out.print("Числа равны.");


        // System.out.print(num1 + " " + num2);
    }
}
