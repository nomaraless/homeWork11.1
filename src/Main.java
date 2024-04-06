import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void cheksLeapYear(int year) {
        if (year % 400 == 0 && year % 4 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void offerUpdate(String a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a.equals("android")) {
            if (b < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (a.equals("ios")) {
            if (b < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("У нас нет для вас предложений");
        }
    }


    public static int ChekDistance(int i) {
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
            cheksLeapYear(year);
        } else {
            System.out.println("Григорианский календарь приняли только в 1584 году");
        }
        System.out.println();
        //task 2
        System.out.println("Укажите операционную систему:  ios or Android");
        String clientOS = sc.next().toLowerCase(Locale.ROOT);
        System.out.println("Укажите год");
        int clientDeviceYear = sc.nextInt();
        offerUpdate(clientOS, clientDeviceYear);
        //task 3
        System.out.println("Укажите расстояние");
        int deliveryDistance = sc.nextInt();
        if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: " + ChekDistance(deliveryDistance));
        } else {
            System.out.println("Доставки свыше 100 км нет");
        }
        System.out.println();
    }
}
