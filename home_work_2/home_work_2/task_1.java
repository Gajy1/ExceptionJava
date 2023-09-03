package home_work_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        // Задача 1:
        //Напишите программу, которая запрашивает у пользователя число и проверяет,
        // является ли оно положительным. Если число отрицательное или равно нулю, программа
        // должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        // В противном случае, программа должна выводить сообщение "Число корректно".

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 1 ======");

        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод! Вводите целые числа!");
        }
        sc.nextLine();
        System.out.println();
    }

    
    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.println("Число корректно.");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}