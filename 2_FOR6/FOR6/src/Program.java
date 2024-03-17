import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i;

        do {
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();

            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

            System.out.print("Для завершения введите '1'. Для продолжения - любое другое число. ");
            i = in.nextInt();
        } while (i != 1);


    }
}
