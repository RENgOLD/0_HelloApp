import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int operation = in.nextInt();

        switch (operation) {
            case 1: System.out.println("Сложение"); break;
            case 2: System.out.println("Вычитание"); break;
            case 3: System.out.println("Умножение"); break;
            default: System.out.println("Операция неопределена");
        }

    }
}
