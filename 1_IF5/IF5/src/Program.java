import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int operation = in.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Результат операции: " + (num1 + num2)); break;
            case 2:
                System.out.println("Результат операции: " + (num1 - num2)); break;
            case 3:
                System.out.println("Результат операции: " + (num1 * num2)); break;
            default: System.out.println("Операция неопределена");
        }

    }
}
