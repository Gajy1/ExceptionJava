package home_work_2;
// Задача 2:
        //Напишите программу, которая запрашивает у пользователя два числа и выполняет
        // их деление. Если второе число равно нулю, программа должна выбрасывать исключение
        // DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае,
        // программа должна выводить результат деления.

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 2 ======");
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        }
        sc.nextLine();
        System.out.println();

}
public static void divide(int a, int b) throws DivisionByZeroException {
    if (b == 0) {
        throw new DivisionByZeroException("Деление на ноль недопустимо!");
    } else {
        System.out.println(a / b);
    }
}
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

