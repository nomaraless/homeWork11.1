import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void cheksTheYears(int year) {
        if (year % 400 == 0 && year % 4 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void toCheckOs(int a, int b) {
        int currentYear = LocalDate.now().getYear();
//        String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
//        String vers = System.getProperty("os.version").toLowerCase(Locale.ROOT);
        if (a == 1) {
            if (b < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (a == 0) {
            if (b < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            throw new RuntimeException("Неверные данные");
        }
    }

    public static int toChekDistance(int i) {
        if (i <= 20) {
            i = 1;
        } else if (i > 20 && i <= 60) {
            i = 2;
        } else if (i > 60 && i <= 100) {
            i = 3;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task 1
        System.out.println("Введите год");
        int year = sc.nextInt();
        if (year >= 1584) {
            cheksTheYears(year);
        } else {
            System.out.println("Григорианский календарь приняли только в 1584 году");
        }
        System.out.println();
        //task 2
        System.out.println("Укажите операционную систему: 0 - ios, 1 - Android");
        int clientOS = sc.nextInt();
        System.out.println("Укажите год");
        int clientDeviceYear = sc.nextInt();
        toCheckOs(clientOS, clientDeviceYear);
        //task 3
        System.out.println("Укажите расстояние");
        int deliveryDistance = sc.nextInt();
        if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: " + toChekDistance(deliveryDistance));
        } else {
            System.out.println("Доставки свыше 100 км нет");
        }
        System.out.println();
    }
}
