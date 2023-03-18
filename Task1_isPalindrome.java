import java.util.Scanner;

// Task 1.
// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
public class Task1_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для проверки: ");
        String someStr = sc.next();
        System.out.println(isPalindrome(someStr));
    }

    private static Boolean isPalindrome(String someStr) {
        int start = 0;
        int end = someStr.length() - 1;
        while (start < end) {
            if (someStr.charAt(start) != someStr.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
