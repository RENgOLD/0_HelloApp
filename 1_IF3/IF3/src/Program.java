import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        int deposit = in.nextInt();

        if ((deposit > 0) & (deposit < 100)) System.out.println("Сумма вклада с процентами = " + deposit * 1.05);
        else if ((deposit >= 100) & (deposit <= 200)) System.out.println("Сумма вклада с процентами = " + deposit * 1.07);
        else if (deposit > 200) System.out.println("Сумма вклада с процентами = " + deposit * 1.1);
        else System.out.println("Введено некорректное число");


        // System.out.print(num1 + " " + num2);
    }
}
