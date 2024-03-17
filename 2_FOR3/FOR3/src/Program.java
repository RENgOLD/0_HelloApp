import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = in.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int time = in.nextInt();

        for (int i = 1; i <= time; i++) {
            deposit *= 1.07;
        }

        System.out.println("После 1 месяцев сумма вклада составит " + deposit);
    }
}
