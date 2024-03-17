import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num = in.nextInt();

        if ((num < 9) & (num > 2)) System.out.print("Число больше 5 и меньше 10");
        else System.out.print("Неизвестное число");


        // System.out.print(num1 + " " + num2);
    }
}
